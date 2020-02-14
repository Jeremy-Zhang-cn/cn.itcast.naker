package com.itheima.controller;

import com.itheima.domain.Role;
import com.itheima.domain.User;
import com.itheima.service.RoleService;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@RequestMapping("/findAll")
	public ModelAndView list() {

		List<User> userList = userService.list();

		ModelAndView mv = new ModelAndView();
		mv.addObject("userList", userList);
		mv.setViewName("user-list");

		return mv;
	}

	@RequestMapping("/saveUI")
	public ModelAndView saveUI() {

		ModelAndView mv = new ModelAndView();
		List<Role> roleList = roleService.list();

		mv.addObject("roleList", roleList);
		mv.setViewName("user-add");

		return mv;
	}

	@RequestMapping("/save")
	public String save(User user, Long[] roleIds) {

		userService.save(user, roleIds);

		return "redirect:/user/findAll";
	}

	@RequestMapping("/delete/{userId}")
	public String delete(@PathVariable("userId") Long userId) {

		userService.delete(userId);

		return "redirect:/user/findAll";
	}

}
