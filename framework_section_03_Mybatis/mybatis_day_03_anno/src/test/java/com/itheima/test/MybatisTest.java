package com.itheima.test;

import com.itheima.domain.Order;
import com.itheima.domain.User;
import com.itheima.mapper.OrderMapper;
import com.itheima.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MybatisTest {

	private SqlSession sqlSession;
	private UserMapper userMapper;
	private OrderMapper orderMapper;

	@Before
	public void init() throws IOException {

		sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml")).openSession();

		userMapper = sqlSession.getMapper(UserMapper.class);

		orderMapper = sqlSession.getMapper(OrderMapper.class);

	}

	@After
	public void destroy() {

		sqlSession.commit();
		sqlSession.close();

	}

	@Test
	public void listAllUserTest() {
		List<User> userList = userMapper.listAll();
		for (User user : userList) {
			System.out.println(user);
			System.out.println(user.getOrderList());
			System.out.println("------------------");
		}
	}

	@Test
	public void getByIdTest() {
		User user = userMapper.getById(1L);
		System.out.println(user);
	}


	@Test
	public void listAllOrderTest() {

		List<Order> orderList = orderMapper.listAll();
		for (Order order : orderList) {
			System.out.println(order);
			System.out.println(order.getUser());
			System.out.println("--------------------");
		}

	}


	@Test
	public void listByConditionTest() {

		User user = new User();

		user.setUsername("zhangsan");

		List<User> userList = userMapper.listByCondition(user);

		for (User u : userList) {
			System.out.println(u);
		}
	}


	@Test
	public void listAllUserAndRoleTest() {

		List<User> userList = userMapper.listUserAndRoleAll();

		for (User user : userList) {
			System.out.println(user);
			System.out.println(user.getRoles());
			System.out.println("~~~~~~~~~~~~");

		}
	}
}
