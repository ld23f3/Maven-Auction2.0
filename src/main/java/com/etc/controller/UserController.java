package com.etc.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.entity.Users;
import com.etc.service.UserService;


@Controller
@RequestMapping("/api")
public class UserController {

	@Resource(name = "userService")
	private UserService userService;

	/**
	 * 跳转至注册页面
	 * 
	 * @return
	 */
	@RequestMapping(value = {"/register.html","/register"}, method = RequestMethod.GET)
	public String showRegister() {
		// System.out.println("showRegister");
		return "/Reception/front-register";
	}

	/**
	 * 跳转至登录页面
	 * 
	 * @return
	 */
	@RequestMapping(value = {"/login.html","/login"}, method = RequestMethod.GET)
	public String showLogin() {
		// System.out.println("showLogin");
		return "/Reception/front-login";
	}
	
	/**
	 * 跳转至个人信息页面
	 * 
	 * @return
	 */
	@RequestMapping(value = {"/contact.html","/contact"}, method = RequestMethod.GET)
	public String showContact() {
		// System.out.println("showContact");
		return "/Reception/front-contact";
	}

	/**
	 * 注册页面的具体实现
	 * 
	 * @param users
	 * @return
	 */
	@RequestMapping(value = {"/register.html","/register"}, method = RequestMethod.POST)

	public String register(Users users) {

		Date date = new Date();
		// 转换成时间格式12小时制
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// 得到注册时候填写的信息
		String user_acc = users.getUser_acc();
		String user_pwd = users.getUser_pwd();
		String user_tel = users.getUser_tel();
		String user_email = users.getUser_email();
		int user_state = 1;
		double user_balance = 0.0;
		String user_create = sdf.format(date);

		// System.out.println(user_acc+","+user_pwd);

		// 实例化一个user2
		Users users2 = new Users(user_acc, user_email, user_tel, user_pwd, user_state, user_create, user_balance);

		// 把数据存在数据库
		boolean flag = userService.addUser(users2);

		if (flag) {

			return "/Reception/front-login";

		}

		return null;
	}

	/**
	 * 注册时验证用户名
	 * 
	 * @param user_Acc
	 * @return
	 */
	@RequestMapping(value = {"/validation","/validation.html"}, method = RequestMethod.GET)
	@ResponseBody
	public String validation(String user_Acc) {
		boolean flag = userService.validation(user_Acc);
		if (flag) {
			return "true";
		} else
			return "false";
	}

	/**
	 * 登陆
	 * 
	 * @param users
	 * @return
	 */
	@RequestMapping(value = {"/login.html","/login"}, method = RequestMethod.POST)
	public String login(Users users, HttpSession session) {

		// 得到用户输入的值
		String user_acc = users.getUser_acc();
		String user_pwd = users.getUser_pwd();

		// System.out.println(user_acc);
		// System.out.println(user_pwd);

		Users user = new Users();
		user.setUser_acc(user_acc);
		user.setUser_pwd(user_pwd);

		user = userService.login(user);

		if (user!=null) {
			session.setAttribute("user", user);
			System.out.println(user);
			return "redirect:/api/query";
		} else
			return null;

	}
	/**
	 * 完善个人信息
	 * @param users
	 * @return
	 */
	@RequestMapping(value = {"/contact.html","/contact"}, method = RequestMethod.POST)

	public String contact(Users users,HttpSession session) {
        Users u=(Users)session.getAttribute("user");
        System.out.println(u);
        
		Date date = new Date();
		// 转换成时间格式12小时制
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// 得到注册时候填写的信息
		String user_realname = users.getUser_realname();
		System.out.println(user_realname);
		String user_cardid = users.getUser_cardid();
		String user_address = users.getUser_address();
		String user_modified = sdf.format(date);
		String user_acc = u.getUser_acc();

		// System.out.println(user_acc+","+user_pwd);

		// 实例化一个user2
		Users users2 = new Users(user_acc, user_realname, user_cardid, user_address, user_modified);

		// 把数据存在数据库
		boolean flag = userService.contact(users2);

		if (flag) {

			return "/Reception/front-login";

		}

		return null;
	}
}
