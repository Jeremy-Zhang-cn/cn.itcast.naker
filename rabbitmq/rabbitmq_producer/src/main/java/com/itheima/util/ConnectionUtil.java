package com.itheima.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ConnectionUtil {

	private ConnectionUtil() {
	}

	public static Connection getConnection() {
		//创建连接工厂（设置RabbitMQ的连接参数）
		ConnectionFactory connectionFactory = new ConnectionFactory();
		//主机；默认localhost
		connectionFactory.setHost("115.29.110.2");
		//连接端口；默认5672
		connectionFactory.setPort(5672);
		//虚拟主机；默认/
		connectionFactory.setVirtualHost("/itcast");
		//用户名；默认guest
		connectionFactory.setUsername("Jeremy");
		//密码；默认guest
		connectionFactory.setPassword("dingjie0822");

		Connection connection = null;
		try {
			connection = connectionFactory.newConnection();
		} catch (IOException | TimeoutException e) {
			e.printStackTrace();
		}

		return connection;
	}

}
