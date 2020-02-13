package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/show")
	public String show() {

		int i = 1 / 0;
		return "success";

	}

}
