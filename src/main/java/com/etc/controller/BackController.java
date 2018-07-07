package com.etc.controller;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etc.util.ImageUtil;

/**
 * 后台系统的登录权限控制
 * 本页主要页面跳转，不需要与数据库交互
 * @author LHC
 *
 */
@Controller
@RequestMapping("manage")
public class BackController {
	/**
	 * 生成验证码图片
	 * @param response
	 * @param session
	 * @throws Exception
	 */
	@RequestMapping(value = "valicode", method = RequestMethod.GET) // 对应/user/valicode.do请求
	public void valicode(HttpServletResponse response, HttpSession session) throws Exception {
		// 利用图片工具生成图片
		// 第一个参数是生成的验证码，第二个参数是生成的图片
		Object[] objs = ImageUtil.createImage();
		// 将验证码存入Session
		session.setAttribute("imageCode", objs[0]);
		// 将图片输出给浏览器
		BufferedImage image = (BufferedImage) objs[1];
		response.setContentType("image/png");
		OutputStream os = response.getOutputStream();
		ImageIO.write(image, "png", os);
	}
	/**
	 * 显示登录界面
	 * @return
	 */
	@RequestMapping(value = "show.html", method = RequestMethod.GET)
	public String showLogin() {
		return "/Back/login";
	}
	/**
	 * 请求登录(这边硬写,只给一个管理员admin,admin)
	 * @param manageName
	 * @param managePwd
	 * @param imageCode
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "show.html", method = RequestMethod.POST)
	public String askLogin(String manageName, String managePwd, String imageCode, HttpSession session) {

		String sessionImageCode = (String) session.getAttribute("imageCode");
		
		// 保存会话登录人数据。后台管理员，只需要一个即可,不做登录账号权限的验证了
		if (sessionImageCode.toLowerCase().equals(imageCode.toLowerCase())) {
			if (manageName != null && managePwd != null) {
				if ("admin".equals(manageName) && "admin".equals(managePwd)) {
					session.setAttribute("manageName", manageName);
					session.setAttribute("managePwd", managePwd);
				}
			}
		}
		// 重定向,地址栏会改变.
		return "redirect:index.html";
	}
	/**
	 * 退出登录
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "exit", method = RequestMethod.GET)
	public String exitLogin(HttpSession session) {
		// 清除会话人的数据
		session.setAttribute("manageName", null);
		session.setAttribute("managePwd", null);
		// 转发,地址栏显示不会变化,但是经过拦截器,最终还是会变成登录界面的地址
		return "forward:index.html";
	}
	/**
	 * 显示后台主页
	 * @return
	 */
	@RequestMapping(value = "index.html")
	public String ShowIndex() {
		return "/Back/index";
	}

}
