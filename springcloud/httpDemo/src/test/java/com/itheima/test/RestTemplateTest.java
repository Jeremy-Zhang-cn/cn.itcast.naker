package com.itheima.test;

import com.itheima.httpDemo.HttpDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HttpDemoApplication.class)
public class RestTemplateTest {

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void test() {
		String url = "https://cn.bing.com/";
		String object = restTemplate.getForObject(url, String.class);
		System.out.println(object);
	}

}
