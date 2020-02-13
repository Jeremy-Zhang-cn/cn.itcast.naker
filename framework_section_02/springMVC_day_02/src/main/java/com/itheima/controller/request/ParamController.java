package com.itheima.controller.request;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/param")
public class ParamController {

	@RequestMapping("/show_01")
	public String show_01(String name, Integer age) {

		System.out.println(name);
		System.out.println(age);

		return "success";
	}

	@RequestMapping("/show_02")
	public String show_02(User user) {
		System.out.println(user);
		return "success";
	}

	@RequestMapping("/show_03")
	public String show_03(String[] hobby) {

		System.out.println(Arrays.toString(hobby));
		return "success";
	}
}
