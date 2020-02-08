package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)	//使用spring中集成的单元测试工具替代JUnit
@ContextConfiguration(classes = SpringConfig.class)	//告诉spring配置文件在哪里
public class SpringTest {

	@Autowired	//利用依赖注入生成AccountService对象
	private AccountService accountService;

	@Test
	public void TestFindAll() {

		List<Account> list = accountService.findAll();
		for (Account account : list) {
			System.out.println(account);
		}

	}

	@Test
	public void TestAdd() {
		accountService.add();
	}

}
