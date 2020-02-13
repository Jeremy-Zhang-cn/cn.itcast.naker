package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/login")
	public String login(String username, String password, HttpSession session) {

		User loginUser = service.login(username, password);

		if (loginUser != null) {    //如果查询结果不为空，说明登陆成功
			//将用户信息存入session中
			session.setAttribute("login_user", loginUser);
			//跳转到查询所有信息
			return "redirect:/user/findAll";
		} else {
			return "message";
		}

	}

	@RequestMapping("/findAll")
	public ModelAndView findAll() {

		List<User> list = service.findAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("user_list");
		return mv;
	}

}
