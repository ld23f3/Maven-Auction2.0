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
 * ��̨ϵͳ�ĵ�¼Ȩ�޿���
 * ��ҳ��Ҫҳ����ת������Ҫ�����ݿ⽻��
 * @author LHC
 *
 */
@Controller
@RequestMapping("manage")
public class BackController {
	/**
	 * ������֤��ͼƬ
	 * @param response
	 * @param session
	 * @throws Exception
	 */
	@RequestMapping(value = "valicode", method = RequestMethod.GET) // ��Ӧ/user/valicode.do����
	public void valicode(HttpServletResponse response, HttpSession session) throws Exception {
		// ����ͼƬ��������ͼƬ
		// ��һ�����������ɵ���֤�룬�ڶ������������ɵ�ͼƬ
		Object[] objs = ImageUtil.createImage();
		// ����֤�����Session
		session.setAttribute("imageCode", objs[0]);
		// ��ͼƬ����������
		BufferedImage image = (BufferedImage) objs[1];
		response.setContentType("image/png");
		OutputStream os = response.getOutputStream();
		ImageIO.write(image, "png", os);
	}
	/**
	 * ��ʾ��¼����
	 * @return
	 */
	@RequestMapping(value = "show.html", method = RequestMethod.GET)
	public String showLogin() {
		return "/Back/login";
	}
	/**
	 * �����¼(���Ӳд,ֻ��һ������Աadmin,admin)
	 * @param manageName
	 * @param managePwd
	 * @param imageCode
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "show.html", method = RequestMethod.POST)
	public String askLogin(String manageName, String managePwd, String imageCode, HttpSession session) {

		String sessionImageCode = (String) session.getAttribute("imageCode");
		
		// ����Ự��¼�����ݡ���̨����Ա��ֻ��Ҫһ������,������¼�˺�Ȩ�޵���֤��
		if (sessionImageCode.toLowerCase().equals(imageCode.toLowerCase())) {
			if (manageName != null && managePwd != null) {
				if ("admin".equals(manageName) && "admin".equals(managePwd)) {
					session.setAttribute("manageName", manageName);
					session.setAttribute("managePwd", managePwd);
				}
			}
		}
		// �ض���,��ַ����ı�.
		return "redirect:index.html";
	}
	/**
	 * �˳���¼
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "exit", method = RequestMethod.GET)
	public String exitLogin(HttpSession session) {
		// ����Ự�˵�����
		session.setAttribute("manageName", null);
		session.setAttribute("managePwd", null);
		// ת��,��ַ����ʾ����仯,���Ǿ���������,���ջ��ǻ��ɵ�¼����ĵ�ַ
		return "forward:index.html";
	}
	/**
	 * ��ʾ��̨��ҳ
	 * @return
	 */
	@RequestMapping(value = "index.html")
	public String ShowIndex() {
		return "/Back/index";
	}

}
