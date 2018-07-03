package com.etc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.etc.entity.Users;

/**
 * �û���صĿ�����
 * 
 * @author LHC
 *
 */
@Controller
@RequestMapping(value = "users")
public class BackUsersController {
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
		List<Users> list = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			Users user = new Users(i, "user_acc" + i, "user_pwd" + i, "user_email" + i, "user_tel" + i,
					"user_realname" + i, "user_cardid" + i, "user_address" + i, 100.0, 0, new Date().toLocaleString(),
					"user_modified" + i);
			list.add(user);
		}
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
		Users user = new Users(user_id, "user_acc" + user_id, "user_pwd" + user_id, "user_email" + user_id,
				"user_tel" + user_id, "user_realname" + user_id, "user_cardid" + user_id, "user_address" + user_id,
				100.0, 0, "user_create" + user_id, "user_modified" + user_id);
		model.addAttribute("user", user);
		return "/Back/member-show";
	}

	/**
	 * ������ʾ�û���¼����
	 * 
	 * @param user_id
	 *            �û�ID(�Ǳ�Ҫ)
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "askAdd", method = RequestMethod.GET)
	public String showAddUser(@RequestParam(value = "user_id", required = false, defaultValue = "0") int user_id,
			Model model) {
		// ������û�д��ݴ������,˵����ע�����,����Ҫ�ṩ����
		// ����������洫����һ���û�ID,Ҫ�Ѹ��û������ݶ��ύ��ҳ��,��ҳ����ô������
		if (user_id != 0) {
			Users user = new Users(user_id, "user_acc" + user_id, "user_pwd" + user_id, "user_email" + user_id, "user_tel" + user_id,
					"user_realname" + user_id, "user_cardid" + user_id, "user_address" + user_id, 100.0, 0, new Date().toLocaleString(),
					"user_modified" + user_id);
			model.addAttribute("user", user);
		}
		return "/Back/member-add";
	}
	@RequestMapping(value = "askEdit", method = RequestMethod.GET)
	public String showEditUser(@RequestParam(value = "user_id", required = true) int user_id,Model model) {
		Users user = new Users(user_id, "user_acc" + user_id, "user_pwd" + user_id, "user_email" + user_id, "user_tel" + user_id,
				"user_realname" + user_id, "user_cardid" + user_id, "user_address" + user_id, 100.0, 0, new Date().toLocaleString(),
				"user_modified" + user_id);
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
	public boolean registerUser(Users user) {
		System.out.println(user);
		// user = new Users(user_acc, user_pwd, user_email, user_tel, user_realname,
		// user_cardid, user_address, user_balance, user_state, user_create,
		// user_modified)
		return true;
	}

	/**
	 * �û�ͣȨ����
	 * 
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value = "stopUser/{user_id}", method = RequestMethod.PUT)
	@ResponseBody
	public boolean stopUser(@PathVariable(value = "user_id") int user_id) {
		if (user_id == 0) {
			return false;
		}
		return true;
	}

	/**
	 * �û�Ȩ�޼���
	 * 
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value = "activeUser/{user_id}", method = RequestMethod.PUT)
	@ResponseBody
	public boolean activeUser(@PathVariable(value = "user_id") int user_id) {
		if (user_id == 0)
			return false;
		return true;
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
		return true;
	}

}
