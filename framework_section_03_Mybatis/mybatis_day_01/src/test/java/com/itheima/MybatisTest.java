package com.itheima;

import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

	private SqlSession sqlSession = null;

	@Before
	public void init() throws IOException {

		//加载mybatis配置文件
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		//获取对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//通过builder对象得到SqlSessionFactory对象
		SqlSessionFactory factory = builder.build(is);
		//通过factory对象得到SqlSession对象(SqlSession = Connection + Statement)
		sqlSession = factory.openSession();
	}

	@After
	public void destroy() {

		//提交事务
		sqlSession.commit();
		//释放资源
		sqlSession.close();

	}

	@Test
	public void addTest() {

		User user = new User(null, "wangwu", 25, "男");

		sqlSession.insert("com.itheima.dao.UserDao.add", user);

	}

	@Test
	public void findAllTest() {

		List<User> list = sqlSession.selectList("com.itheima.dao.UserDao.findAll");
		for (User user : list) {
			System.out.println(user);
		}
	}


	@Test
	public void findByName() {

		User user = sqlSession.selectOne("com.itheima.dao.UserDao.findByName", "wangwu");

		System.out.println(user);

	}

	@Test
	public void updateTest() {

		User user = new User(5, "wanger", 22, "女");

		sqlSession.update("com.itheima.dao.UserDao.updateById", user);

	}

	@Test
	public void deleteTest() {

		sqlSession.delete("com.itheima.dao.UserDao.deleteById", 5);
	}

}
