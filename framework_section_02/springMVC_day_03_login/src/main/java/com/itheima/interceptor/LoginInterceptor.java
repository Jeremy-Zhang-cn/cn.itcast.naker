package com.itheima.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		//判断session中是否存储有用户信息
		Object login_user = request.getSession().getAttribute("login_user");

		//如果login_user不为null，表明已经登录过了
		if (login_user != null) {
			//放行
			return true;
		} else {
			//还没有登陆
			response.sendRedirect(request.getContextPath() + "/jsp/login.jsp");
			return false;
		}

	}
}
