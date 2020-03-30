package com.itheima.consumerdemo.controller;

import com.itheima.consumerdemo.pojo.User;


import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
@Slf4j
@DefaultProperties(defaultFallback = "defaultFallback")
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/{id}")
//	@HystrixCommand(fallbackMethod = "queryByIdFallback")
	@HystrixCommand
	public String queryById(@PathVariable("id") Long id) {

		if (id == 2) {
			throw new RuntimeException("请求过于频繁");
		}

		String url = "http://user-service/user/" + id;

/*

		List<ServiceInstance> serviceInstanceList
				= discoveryClient.getInstances("user-service");

		ServiceInstance serviceInstance = serviceInstanceList.get(0);

		url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/" + id;
*/

		return restTemplate.getForObject(url, String.class);
	}

	//编写熔断降级逻辑代码
	public String queryByIdFallback(@PathVariable Long id) {
		log.error("查询用户信息失败，id: {}", id);
		return "网络拥塞，请等待";
	}

	//默认熔断提示
	public String defaultFallback() {
		return "默认提示：网络拥塞，请等待";
	}

}
