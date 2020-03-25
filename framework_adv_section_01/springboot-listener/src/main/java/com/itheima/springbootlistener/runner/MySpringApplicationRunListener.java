package com.itheima.springbootlistener.runner;

import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MySpringApplicationRunListener implements SpringApplicationRunListener {

	@Override
	public void starting() {
		System.out.println("starting...");
	}

	@Override
	public void environmentPrepared(ConfigurableEnvironment environment) {
		System.out.println("environment preparing...");
	}

	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
		System.out.println("context preparing");
	}

	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
		System.out.println("context loaded...");
	}

	@Override
	public void started(ConfigurableApplicationContext context) {
		System.out.println("started...");
	}

	@Override
	public void running(ConfigurableApplicationContext context) {
		System.out.println("running...");
	}

	@Override
	public void failed(ConfigurableApplicationContext context, Throwable exception) {
		System.out.println("failed...");
	}

}
