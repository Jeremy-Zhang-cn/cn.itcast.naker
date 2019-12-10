package com.itheima.mysql_day05.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.mysql_day05.druid_demo.DruidDemo_01;

import javax.sql.DataSource;
import java.util.Properties;

public class JDBCUtils {

	/*
		数据库连接池工具类
	 */
	private static DataSource ds;

	private JDBCUtils() {
	}

	//静态代码块用来加载连接池配置文件并获取连接池对象
	static {
		Properties pro = new Properties();
		try {
			//加载配置文件
			pro.load(DruidDemo_01.class.getClassLoader().getResourceAsStream("druid.properties"));
			//获取连接池对象
			ds = DruidDataSourceFactory.createDataSource(pro);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//获取连接池对象
	public static DataSource getDatasource() {
		return ds;
	}

}
