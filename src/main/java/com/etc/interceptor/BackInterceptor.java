package com.etc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class BackInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handle,
			Exception exception) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handle,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handle) throws Exception {
		
		System.out.println(request.getServletPath());
		HttpSession session = request.getSession();
		String manageName = (String) session.getAttribute("manageName");
		String managePwd = (String) session.getAttribute("managePwd");
		if (manageName != null && managePwd != null) {
			if ("admin".equals(manageName) && "admin".equals(managePwd)) {
				return true;
			}
		}
		session.setAttribute("manageName", null);
		session.setAttribute("managePwd", null);
		//这边不能确定用户一定是从manage界面过来的,绝对路径比较靠谱
		response.sendRedirect(request.getContextPath() + "/manage/show.html");
		return false;
	}

}
