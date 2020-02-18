package com.itheima;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.UserMapper;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UserTest {

	private SqlSession sqlSession = null;

	private UserMapper mapper = null;

	@Before
	public void init() throws IOException {

		//加载mybatis配置文件
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		//获取SqlSessionFactoryBuilder对象
	//	SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//通过builder对象得到SqlSessionFactory对象
		//SqlSessionFactory factory = builder.build(is);
	//	SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

		//通过factory对象得到SqlSession对象(SqlSession = Connection + Statement)
		//sqlSession = factory.openSession();
		sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();

		//通过sqlSession获取dao对象
		mapper = sqlSession.getMapper(UserMapper.class);

	}

	@After
	public void destroy() {

		sqlSession.commit();
		sqlSession.close();

	}

	@Test
	public void add() {

		User user = new User(null, "zhaoliu", 26, "女");
		mapper.add(user);

	}

	@Test
	public void findAllTest() {

		//使用PageHelper实现分页查询功能
		PageHelper.startPage(2, 2);

		List<User> userList = mapper.findAll();

		PageInfo<User> pageInfo = new PageInfo<>(userList);

		System.out.println("总条目数：" + pageInfo.getTotal());
		System.out.println("下一页码为：" + pageInfo.getNextPage());
		System.out.println("本页结束行为：" + pageInfo.getEndRow());
		System.out.println("是否为第一页：" + pageInfo.isIsFirstPage());

		for (User user : userList) {
			System.out.println(user);
		}
	}


	@Test
	public void findOneTest() {

		User user = new User();
		user.setName("zhangsan");

		User one = mapper.findOne(user);

		System.out.println(one);

	}

	@Test
	public void findByIds() {

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);

		List<User> userList = mapper.findByIds(list);

		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	public void findByConditionsTest() {

		User user = new User();

		user.setName("wangwu");

		List<User> conditions = mapper.findByConditions(user);

		for (User condition : conditions) {
			System.out.println(condition);
		}

	}

	@Test
	public void findLikeNameTest() {

		String name = "zhang";

		List<User> list = mapper.findLikeName("%" + name + "%");
	//	List<User> list = mapper.findLikeName("%n%");

		for (User user : list) {
			System.out.println(user);
		}
	}


}
