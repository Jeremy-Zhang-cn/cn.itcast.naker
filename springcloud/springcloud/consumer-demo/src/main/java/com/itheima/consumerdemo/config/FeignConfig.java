package com.itheima.consumerdemo.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

	@Bean
	Logger.Level feignLoggerLevel() {
		//记录所有请求和响应的信息
		return Logger.Level.FULL;
	}
}
