package com.itheima.web.servlet;

import com.itheima.domain.User;
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

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//获取map
		Map<String, String[]> map = request.getParameterMap();

		User user = new User();
		//封装对象
		try {
			BeanUtils.populate(user,map);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}


		//调用service修改
		new UserServiceImpl().updateUser(user);
		//跳转到查询页面
		response.sendRedirect(request.getContextPath() + "/userListServlet");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
