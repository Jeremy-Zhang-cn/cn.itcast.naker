package com.itheima.web.servlet;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取用户输入的验证码
		String verifycode = request.getParameter("verifycode");

		//从session中获取生成的验证码
		String checkcode_server = (String) request.getSession().getAttribute("CHECKCODE_SERVER");
		//清除session中原有的验证码，避免验证失败后验证码得不到刷新
		request.getSession().removeAttribute("CHECKCODE_SERVER");

		if (!(checkcode_server.equalsIgnoreCase(verifycode))) {
			//如果验证失败，给出提示信息
			request.setAttribute("login_failed_msg", "验证码有误！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}

		//从请求中获取用户名和密码
		User user = new User();
		Map<String, String[]> map = request.getParameterMap();

		try {
			BeanUtils.populate(user, map);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}


		//获取UserService的实现类对象
		UserService service = new UserServiceImpl();
		User login = new User();

		try {
			//查询数据库中是否存在
			login = service.login(user);
		} catch (Exception e) {
			e.printStackTrace();
		}


		if (login != null) {
			request.setAttribute("username", user.getUsername());
			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			request.setAttribute("login_failed_msg", "登录失败！用户名或密码有误");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}


	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
