package com.itheima.mysql_day05.druid_demo;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo_01 {

	/*
		druid数据库连接池练习
	 */
	public static void main(String[] args) {
		//1. 导入jar包
		//2. 定义配置文件
		//3. 加载配置文件
		Properties pro = new Properties();
		//使用类加载器加载配置文件到输入流
		InputStream is = DruidDemo_01.class.getClassLoader().getResourceAsStream("druid.properties");
		try {
			pro.load(is);
			//4. 获取连接池对象
			DataSource ds = DruidDataSourceFactory.createDataSource(pro);
			//5. 获取连接
			Connection conn = ds.getConnection();
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
