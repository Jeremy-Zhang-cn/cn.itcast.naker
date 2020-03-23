package com.itheima.springboot_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//获取普通配置
	@Value("${name}")
	private String name;

	//获取对象属性
	@Value("${person.name}")
	private String name2;

	//获取数组
	@Value("${address[0]}")
	private String address;

	//获取纯量
	@Value("${msg1}")
	private String msg1;

	@Value("${msg2}")
	private String msg2;

	@Autowired
	private Environment env;


	@RequestMapping("/hello")
	public String hello() {

		System.out.println(name);
		System.out.println(name2);
		System.out.println(address);
		System.out.println(msg1);
		System.out.println(msg2);

		System.out.println("~~~~~~~");
		System.out.println(env.getProperty("person.name"));
		System.out.println(env.getProperty("person.address[0]"));
		return "hello, here is spring boot !";

	}
}
