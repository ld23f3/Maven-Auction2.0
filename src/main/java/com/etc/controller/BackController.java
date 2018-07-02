package com.etc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * ��̨ϵͳ�ĵ�¼Ȩ�޿���
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
		//����Ự��¼�����ݡ���̨����Ա��ֻ��Ҫһ������,������¼�˺�Ȩ�޵���֤��
		session.setAttribute("manageName", manageName);
		session.setAttribute("managePwd", managePwd);
		//�ض���,��ַ����ı�.
		return "redirect:index.html";
	}
	@RequestMapping(value="exit",method=RequestMethod.GET)
	public String exitLogin(HttpSession session) {
		//����Ự�˵�����
		session.setAttribute("manageName", null);
		session.setAttribute("managePwd", null);
		return "forward:index.html";
	}
	@RequestMapping(value="index.html")
	public String ShowIndex() {
		return "/Back/index";
	}
	
}
