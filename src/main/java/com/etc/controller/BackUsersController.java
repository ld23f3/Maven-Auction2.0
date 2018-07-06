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
 * 用户相关的控制器
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
	 * 获取指定状态用户的列表
	 * 
	 * @param user_state
	 *            0 启用/1停权
	 * @param mav
	 *            本操作该返回的视图以及数据
	 * @return
	 */
	@RequestMapping(value = "getList", method = RequestMethod.GET)
	public ModelAndView getUsersList(
			@RequestParam(value = "user_state", required = false, defaultValue = "0") int user_state,
			ModelAndView mav) {
		List<Users> list = us.queryUsersByState(user_state);
		mav.addObject("list", list);
		if (user_state == 0) {
			/// 这边显示的是正常的会员
			mav.setViewName("/Back/member-list");
		} else {
			/// 这边显示被停权的会员
			mav.setViewName("/Back/member-del");
		}
		mav.addObject("size", list.size());
		return mav;
	}

	/**
	 * 获取用户详细信息
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
	 * 请求添加用户登录界面
	 * 
	 * @param user_id
	 *            用户ID(非必要)
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "askAdd", method = RequestMethod.GET)
	public String showAddUser(@RequestParam(value = "user_id", required = false, defaultValue = "0") int user_id,
			HttpServletRequest request, Model model) {
		// 如果这边没有传递传输过来,说明是注册界面,不需要提供参数
		// 否则如果界面传过来一个用户ID,要把该用户的数据都提交给页面,看页面怎么做处理
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
	 * 请求显示修改密码
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
	 * 注册用户
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	@ResponseBody
	public boolean registerUser(@RequestBody Users user) {
		//用户存在,就注册失败
		if (us.validation(user.getUser_acc())) {
			return false;
		}
		return us.addUser(user);
	}

	/**
	 * 更新用户信息
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
	 * 请求修改密码
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "updatePwd", method = RequestMethod.PUT)
	@ResponseBody
	public boolean updatePwd(@RequestBody Users user) {
		// 实现类未提供直接修改密码的方法,先这样应该吧
		Users newUser = us.queryUsersById(user.getUser_id());
		newUser.setUser_pwd(user.getUser_pwd());
		return us.updateUser(newUser);
	}

	/**
	 * 用户停权操作
	 * 用户状态(0启用1停权)
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
	 * 用户权限激活
	 * 用户状态(0启用1停权)
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
	 * 用户彻底删除
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
	 * 批量删除选中的用户
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
	 * 批量停权选中的用户
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
