package web.servlet;

import dao.UserDao;
import domain.User;
import org.apache.commons.beanutils.*;

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
		//设置页面编码
		request.setCharacterEncoding("utf-8");

		/*
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		*/

		Map<String, String[]> map = request.getParameterMap();
	//	User loginUser = new User();
		User user = new User();
		UserDao userDao = new UserDao();

		try {
			//使用BeanUtils工具类将map封装为对应User对象
			BeanUtils.populate(user,map);
			//使用Dao判断用户是否存在
			user = userDao.login(user);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		//	User user = userDao.login(loginUser);

		if (user == null) {
			request.getRequestDispatcher("failServlet").forward(request, response);
		} else {
			request.setAttribute("username",user.getUsername());
			request.getRequestDispatcher("successServlet").forward(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
