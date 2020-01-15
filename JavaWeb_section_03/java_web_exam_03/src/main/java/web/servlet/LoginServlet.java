package web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.User;
import org.apache.commons.beanutils.BeanUtils;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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

		//获取用户输入信息
		Map<String, String[]> map = request.getParameterMap();
		String remember = request.getParameter("remember");

	//	System.out.println(remember);

		User user = new User();
		User login_user = null;
		UserService service = new UserServiceImpl();


		//封装信息
		try {
			BeanUtils.populate(user, map);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}


		Cookie cookie_name = new Cookie("username", user.getUsername());
		Cookie cookie_passwd = new Cookie("password", user.getPassword());



		//调用service查询
		try {
			login_user = service.findUser(user);
		} catch (Exception e) {
		//	e.printStackTrace();
		}


		if (login_user != null) {
			if ("remember-me".equals(remember)) {

				cookie_name.setMaxAge(60*60*20*7);
				cookie_passwd.setMaxAge(60*60*20*7);

				response.addCookie(cookie_name);
				response.addCookie(cookie_passwd);

			}
			response.sendRedirect("success.html");

		} else {
			response.sendRedirect("error.html");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
