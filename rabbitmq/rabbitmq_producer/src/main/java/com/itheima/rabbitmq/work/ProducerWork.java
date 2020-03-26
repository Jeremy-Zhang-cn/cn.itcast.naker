package com.itheima.rabbitmq.work;

import com.itheima.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * work工作队列模式：发送消息
 */
public class ProducerWork {

	static final String QUEUE_NAME = "work_queue";

	public static void main(String[] args) throws IOException, TimeoutException {

		//创建连接
		Connection connection = ConnectionUtil.getConnection();

		//创建频道
		Channel channel = connection.createChannel();

		//声明队列
		channel.queueDeclare(QUEUE_NAME, true, false, false, null);

		for (int i = 1; i <= 30; i++) {
			//发送消息
			String message = "Hello, RabbitMQ.On work mode--" + i;

			channel.basicPublish("", QUEUE_NAME, null, message.getBytes());

			System.out.println("已发送消息：" + message);

		}

		//关闭资源
		channel.close();
		connection.close();

	}

}
