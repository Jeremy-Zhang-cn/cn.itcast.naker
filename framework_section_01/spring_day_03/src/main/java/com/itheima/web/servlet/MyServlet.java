package com.itheima.web.servlet;

import com.itheima.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyServlet {

	public static void main(String[] args) {

	//	ApplicationContext app =
	//			new ClassPathXmlApplicationContext("applicationContext.xml");

		ApplicationContext app =
				new ClassPathXmlApplicationContext("applicationContext-anno.xml");

		AccountDao accountDao = app.getBean(AccountDao.class);

		accountDao.add();
		accountDao.del();
		accountDao.upd();
		accountDao.find();
	}
}
