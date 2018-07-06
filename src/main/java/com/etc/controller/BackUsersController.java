package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.etc.entity.Users;
import com.etc.service.UserService;

/**
 * �û���صĿ�����
 * 
 * @author LHC
 *
 */
@Controller
@RequestMapping(value = "users")
public class BackUsersController {
	@Resource(name = "userService")
	UserService us;

	/**
	 * ��ȡָ��״̬�û����б�
	 * 
	 * @param user_state
	 *            0 ����/1ͣȨ
	 * @param mav
	 *            �������÷��ص���ͼ�Լ�����
	 * @return
	 */
	@RequestMapping(value = "getList", method = RequestMethod.GET)
	public ModelAndView getUsersList(
			@RequestParam(value = "user_state", required = false, defaultValue = "0") int user_state,
			ModelAndView mav) {
		List<Users> list = us.queryUsersByState(user_state);
		mav.addObject("list", list);
		if (user_state == 0) {
			/// �����ʾ���������Ļ�Ա
			mav.setViewName("/Back/member-list");
		} else {
			/// �����ʾ��ͣȨ�Ļ�Ա
			mav.setViewName("/Back/member-del");
		}
		mav.addObject("size", list.size());
		return mav;
	}

	/**
	 * ��ȡ�û���ϸ��Ϣ
	 * 
	 * @param user_id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "userInfo", method = RequestMethod.GET)
	public String getUserInfo(@RequestParam(value = "user_id", required = true, defaultValue = "1") int user_id,
			Model model) {
		Users user = us.queryUsersById(user_id);
		model.addAttribute("user", user);
		return "/Back/member-show";
	}

	/**
	 * ��������û���¼����
	 * 
	 * @param user_id
	 *            �û�ID(�Ǳ�Ҫ)
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "askAdd", method = RequestMethod.GET)
	public String showAddUser(@RequestParam(value = "user_id", required = false, defaultValue = "0") int user_id,
			HttpServletRequest request, Model model) {
		// ������û�д��ݴ������,˵����ע�����,����Ҫ�ṩ����
		// ����������洫����һ���û�ID,Ҫ�Ѹ��û������ݶ��ύ��ҳ��,��ҳ����ô������
		if (user_id != 0) {
			Users user = us.queryUsersById(user_id);
			model.addAttribute("user", user);
			model.addAttribute("actionSrc", request.getContextPath() + "/users/updateUser");
			model.addAttribute("type", "PUT");
		} else {
			model.addAttribute("type", "POST");
			model.addAttribute("actionSrc", request.getContextPath() + "/users/registerUser");
		}
		return "/Back/member-add";
	}

	/**
	 * ������ʾ�޸�����
	 * 
	 * @param user_id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "askChangePwd", method = RequestMethod.GET)
	public String showEditUser(@RequestParam(value = "user_id", required = true) int user_id, Model model) {
		Users user = us.queryUsersById(user_id);
		model.addAttribute("user", user);
		return "/Back/change-password";
	}

	/**
	 * ע���û�
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	@ResponseBody
	public boolean registerUser(@RequestBody Users user) {
		//�û�����,��ע��ʧ��
		if (us.validation(user.getUser_acc())) {
			return false;
		}
		return us.addUser(user);
	}

	/**
	 * �����û���Ϣ
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "updateUser", method = RequestMethod.PUT)
	@ResponseBody
	public boolean updateUser(@RequestBody Users user) {
		return us.updateUser(user);
	}

	/**
	 * �����޸�����
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "updatePwd", method = RequestMethod.PUT)
	@ResponseBody
	public boolean updatePwd(@RequestBody Users user) {
		// ʵ����δ�ṩֱ���޸�����ķ���,������Ӧ�ð�
		Users newUser = us.queryUsersById(user.getUser_id());
		newUser.setUser_pwd(user.getUser_pwd());
		return us.updateUser(newUser);
	}

	/**
	 * �û�ͣȨ����
	 * �û�״̬(0����1ͣȨ)
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value = "stopUser/{user_id}", method = RequestMethod.PUT)
	@ResponseBody
	public boolean stopUser(@PathVariable(value = "user_id") int user_id) {
		if (user_id == 0) {
			return false;
		}
		return us.updateUserState(user_id, 1);
	}

	/**
	 * �û�Ȩ�޼���
	 * �û�״̬(0����1ͣȨ)
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value = "activeUser/{user_id}", method = RequestMethod.PUT)
	@ResponseBody
	public boolean activeUser(@PathVariable(value = "user_id") int user_id) {
		if (user_id == 0)
			return false;
		return us.updateUserState(user_id, 0);
	}

	/**
	 * �û�����ɾ��
	 * 
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value = "deleteUser/{user_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteUser(@PathVariable(value = "user_id") int user_id) {
		if (user_id == 0)
			return false;
		return us.deleteUserById(user_id);
	}

	/**
	 * ����ɾ��ѡ�е��û�
	 * 
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "deleteCheckUser", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteCheckUser(@RequestBody List<Integer> list) {
		return us.batchDeleteUsers(list);
	}

	/**
	 * ����ͣȨѡ�е��û�
	 * 
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "stopCheckUser", method = RequestMethod.PUT)
	@ResponseBody
	public boolean stopCheckUser(@RequestBody List<Integer> list) {
		return us.batchSetUsersState(list, 1);
	}

}
