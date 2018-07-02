package com.etc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 后台系统的登录权限控制
 * @author LHC
 *
 */
@Controller
@RequestMapping("manage")
public class BackController {
	@RequestMapping(value="show.html",method=RequestMethod.GET)
	public String showLogin() {
		return "/Back/login";
	}
	@RequestMapping(value="show.html",method=RequestMethod.POST)
	public String askLogin(String manageName,String managePwd, String imageCode,HttpSession session) {
		//保存会话登录人数据。后台管理员，只需要一个即可,不做登录账号权限的验证了
		session.setAttribute("manageName", manageName);
		session.setAttribute("managePwd", managePwd);
		//重定向,地址栏会改变.
		return "redirect:index.html";
	}
	@RequestMapping(value="exit",method=RequestMethod.GET)
	public String exitLogin(HttpSession session) {
		//清除会话人的数据
		session.setAttribute("manageName", null);
		session.setAttribute("managePwd", null);
		return "forward:index.html";
	}
	@RequestMapping(value="index.html")
	public String ShowIndex() {
		return "/Back/index";
	}
	
}
