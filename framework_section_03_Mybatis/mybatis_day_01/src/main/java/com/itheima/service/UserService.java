package com.itheima.service;

import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class UserService {

	public static void main(String[] args) throws Exception {

		//加载mybatis配置文件
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		//获取对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//通过builder对象得到SqlSessionFactory对象
		SqlSessionFactory factory = builder.build(is);
		//通过factory对象得到SqlSession对象(SqlSession = Connection + Statement)
		SqlSession sqlSession = factory.openSession();

		/*
		List<User> list = sqlSession.selectList("com.itheima.dao.UserDao.findAll");

		for (User user : list) {
			System.out.println(user);
		}
		*/


		/*User user = sqlSession.selectOne("com.itheima.dao.UserDao.findByName", "zhangsan");
		System.out.println(user);*/
/*

		User user = new User();
		user.setId(null);
		user.setName("wangwu");
		user.setAge(25);
		user.setGender("男");
*/

	//	sqlSession.insert("com.itheima.dao.UserDao.add", user);

		sqlSession.delete("com.itheima.dao.UserDao.deleteById",4);

		//提交事务
		sqlSession.commit();

		sqlSession.close();

	}

}
