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
 * 用户相关的控制器
 * 
 * @author LHC
 *
 */
@Controller
@RequestMapping(value = "users")
public class BackUsersController {
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
		List<Users> list = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			Users user = new Users(i, "user_acc" + i, "user_pwd" + i, "user_email" + i, "user_tel" + i,
					"user_realname" + i, "user_cardid" + i, "user_address" + i, 100.0, 0, new Date().toLocaleString(),
					"user_modified" + i);
			list.add(user);
		}
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
		Users user = new Users(user_id, "user_acc" + user_id, "user_pwd" + user_id, "user_email" + user_id,
				"user_tel" + user_id, "user_realname" + user_id, "user_cardid" + user_id, "user_address" + user_id,
				100.0, 0, "user_create" + user_id, "user_modified" + user_id);
		model.addAttribute("user", user);
		return "/Back/member-show";
	}

	/**
	 * 请求显示用户登录界面
	 * 
	 * @param user_id
	 *            用户ID(非必要)
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "askAdd", method = RequestMethod.GET)
	public String showAddUser(@RequestParam(value = "user_id", required = false, defaultValue = "0") int user_id,
			Model model) {
		// 如果这边没有传递传输过来,说明是注册界面,不需要提供参数
		// 否则如果界面传过来一个用户ID,要把该用户的数据都提交给页面,看页面怎么做处理
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
	 * 注册用户
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
	 * 用户停权操作
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
	 * 用户权限激活
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
		return true;
	}

}
