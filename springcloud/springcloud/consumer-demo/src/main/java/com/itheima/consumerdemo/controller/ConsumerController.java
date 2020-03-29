package com.itheima.consumerdemo.controller;

import com.itheima.consumerdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{id}")
	public User queryById(Long id) {
		String url = "http://localhost:9091/user/" + id;
		return restTemplate.getForObject(url, User.class);
	}

}
