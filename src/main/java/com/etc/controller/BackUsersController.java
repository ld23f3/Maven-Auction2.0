package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value = "getlist", method = RequestMethod.GET)
	public String getUsersList(Model model) {
		List<Users> list = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			Users user = new Users(i, "user_acc" + i, "user_pwd" + i, "user_email" + i, "user_tel" + i,
					"user_realname" + i, "user_cardid" + i, "user_address" + i, 100.0, 0, "user_create" + i,
					"user_modified" + i);
			list.add(user);
		}
		model.addAttribute("list", list);
		return "/Back/member-list";
	}

	@RequestMapping(value = "userInfo", method = RequestMethod.GET)
	public String getUserInfo() {

		return "/Back/member-show";
	}
}
