package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");

		//获取数据
		Map<String, String[]> map = request.getParameterMap();
		//获取生成的验证码
		String checkcode_server = (String)request.getSession().getAttribute("CHECKCODE_SERVER");

		String check = request.getParameter("check");	//获取用户输入的验证码

		//移除session中存储的验证码，否则会造成验证码二次输入的时候无法验证通过
		request.getSession().removeAttribute("VERIFY_CODE");

		//比较
		if (checkcode_server == null || !checkcode_server.equalsIgnoreCase(check)) {
			//验证码有误
			ResultInfo info = new ResultInfo();
			//注册失败
			info.setFlag(false);
			info.setErrorMsg("验证码错误");
			//将info对象序列化为json
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(info);

			response.getWriter().write(json);

			return;

		}

		//封装对象
		User user = new User();

		try {
			BeanUtils.populate(user,map);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		//调用service完成注册
		UserService service = new UserServiceImpl();
		boolean flag = service.regist(user);
		ResultInfo info = new ResultInfo();
		//响应结果
		if (flag) {
			//注册成功
			info.setFlag(true);
		} else {
			//注册失败
			info.setFlag(false);
			info.setErrorMsg("注册失败！用户名已存在！");
		}

		//将info对象序列化为json
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(info);

		//将json数据写回客户端
		response.getWriter().write(json);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
}
