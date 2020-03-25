package com.itheima.springbootlistener.runner;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationContextInitializer implements ApplicationContextInitializer {

	@Override
	public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
		System.out.println("ApplicationContextInitializer...");
	}
}
