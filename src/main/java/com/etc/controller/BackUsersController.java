package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	 * ��ȡ�������õ��û��б�
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "getList", method = RequestMethod.GET)
	public String getUsersList(@RequestParam(value="user_state",required=false,defaultValue="0")int user_state, Model model) {
		System.out.println(user_state);
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
}
