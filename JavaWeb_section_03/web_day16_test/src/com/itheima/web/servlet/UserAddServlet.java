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

@WebServlet("/userAddServlet")
public class UserAddServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取用户输入信息,封装为Map
		Map<String, String[]> map = request.getParameterMap();

		User user = new User();

		//从页面获取年龄
		String age = request.getParameter("age");
		//转化为int类型
		int u_age = Integer.parseInt(age);


		try {
			//利用BeanUtils封装Map为User对象
			BeanUtils.populate(user,map);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		user.setAge(u_age);

		//使用UserService的实现类对象插入数据
		UserService service = new UserServiceImpl();
		service.addUser(user);

		//跳转至list页面
		response.sendRedirect("userListServlet");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
