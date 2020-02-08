package com.itheima.web.servlet;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountServlet {

	@Autowired
	AccountService service;

	@Test
	public void transferTest() {
		service.transfer("zhangsan", "lisi", 1000.0);
	}

	@Test
	public void findAllTest() {

		List<Account> list = service.findAll();

		for (Account account : list) {
			System.out.println(account);
		}

	}

}
