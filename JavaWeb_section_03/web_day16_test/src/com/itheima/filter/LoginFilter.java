package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

		//强转
		HttpServletRequest request = (HttpServletRequest) req;

		//获取资源请求路径
		String uri = request.getRequestURI();
		//判断是否包含登录相关资源路径，排除掉css/js/图片/验证码等资源
		if (uri.contains("/login.jsp") || uri.contains("/loginServlet") || uri.contains("/css/") || uri.contains("/js/") || uri.contains("/fonts/") || uri.contains("/checkCode")) {
			//包含，用户已登录，放行
			chain.doFilter(req, resp);
		} else {
			//不包含，需要验证用户是否登录
			//从获取session中获取user
			Object user = request.getSession().getAttribute("user");

			if (user != null) {
				//登录了，放行
				chain.doFilter(req, resp);
			} else {
				//没有登录，跳转至登录页面
				request.setAttribute("login_failed_msg","您尚未登录，请登录");
				request.getRequestDispatcher("/login.jsp").forward(request,resp);
			}
		}

	}

	public void init(FilterConfig config) throws ServletException {

	}

}
