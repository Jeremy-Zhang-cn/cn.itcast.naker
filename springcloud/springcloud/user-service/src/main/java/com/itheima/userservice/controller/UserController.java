package com.itheima.userservice.controller;

import com.itheima.userservice.pojo.User;
import com.itheima.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RefreshScope	//刷新配置
public class UserController {

	@Autowired
	private UserService userService;

	@Value("${test.name}")
	private String name;

	@GetMapping("/{id}")
	public User queryById(@PathVariable Long id) {
		System.out.println("配置文件中的test.name = " + name);
		return userService.queryById(id);
	}

}
