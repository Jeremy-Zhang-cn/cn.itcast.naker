package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/show_01")
	public String show_01() {
		System.out.println("show_01 is running...");

		//默认为forward
		return "show_01";
	}

	@RequestMapping("show_02")
	public String show_02() {
		System.out.println("show_02 is running...");
		return "show_02";
	}

	@RequestMapping("show_03")
	public String show_03() {
		System.out.println("show_03 is running...");

		//如果希望返回值不经过视图解析器，则需要在返回值前边加上关键字 forward或者redirect
		return "forward:success.jsp";
//		return "redirect:/success.jsp";

	}

}
