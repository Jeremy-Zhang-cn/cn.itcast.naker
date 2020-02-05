package com.itheima.web.servlet;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyServlet {

	public static void main(String[] args) throws InterruptedException {

		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountService accountService = (AccountService) app.getBean("accountService");

		List<Account> list = accountService.findAll();

		for (Account account : list) {
			System.out.println(account);
		}


	}
}
