package com.itheima.web.servlet;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountServlet {

	public static void main(String[] args) {

		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

//		AccountService accountService = (AccountService) app.getBean("accountService");
		AccountService accountService = app.getBean(AccountService.class);

		List<Account> list = accountService.findAll();

		for (Account account : list) {

			System.out.println(account);

		}
	}
}
