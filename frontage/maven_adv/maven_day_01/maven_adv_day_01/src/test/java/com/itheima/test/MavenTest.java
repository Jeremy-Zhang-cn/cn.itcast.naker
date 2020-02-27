package com.itheima.test;

import com.itheima.domain.Item;
import com.itheima.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-all.xml")
public class MavenTest {

	@Autowired
	private ItemService itemService;

	@Test
	public void test_01() {

		Item item = itemService.getById(1);
		System.out.println(item);

	}
}
