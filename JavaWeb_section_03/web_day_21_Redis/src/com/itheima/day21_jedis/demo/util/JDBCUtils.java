package com.itheima.day21_jedis.demo.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

	private JDBCUtils() {
	}

	private static DataSource ds;

	static {
		try {

			//加载配置文件
			Properties pro = new Properties();
			//获取字节流文件
			InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
			pro.load(is);

			//初始化连接池对象
			ds = DruidDataSourceFactory.createDataSource(pro);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//返回连接池对象
	public static DataSource getDatasource() {
		return ds;
	}

	//返回Connection对象
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

}
