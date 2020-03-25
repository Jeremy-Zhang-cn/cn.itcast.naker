package com.itheima.springbootcondition_manual.config;


import com.itheima.springbootcondition_manual.custom.ConditionOnClass;
import com.itheima.springbootcondition_manual.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

	@Bean
	@ConditionOnClass("redis.clients.jedis.Jedis")
	public User user() {
		return new User();
	}

	@Bean
	@ConditionalOnProperty(name = "itcast", havingValue = "itheima")
	public User getUser() {
		return new User();
	}
}
