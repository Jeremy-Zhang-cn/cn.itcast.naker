package com.itheima.controller;

import com.itheima.domain.Role;
import com.itheima.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@RequestMapping("/roleControl")
	public ModelAndView roleControl() {

		ModelAndView mv = new ModelAndView();

		List<Role> roleList = roleService.list();

		//设置模型
		mv.addObject("roleList", roleList);
		//设置视图
		mv.setViewName("role-list");

		return mv;

	}

	@RequestMapping("/save")
	public String save(Role role) {

		roleService.save(role);

		return "redirect:/role/roleControl";
	}

	@RequestMapping("/deleteRoleById")
	public String deleteRoleById(Integer id) {

		roleService.delete(id);

		return "redirect:/role/roleControl";

	}
}
