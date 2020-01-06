package com.itheima.day_20.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

//获取数据库连接池对象的工具类

public class JDBCUtils {

	private JDBCUtils() {

	}

	private static DataSource ds;

	static {

		//加载配置文件
		Properties pro = new Properties();
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
		try {
			pro.load(is);
			//获取连接池对象
			ds = DruidDataSourceFactory.createDataSource(pro);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static DataSource getDataSource() {
		return ds;
	}

}
