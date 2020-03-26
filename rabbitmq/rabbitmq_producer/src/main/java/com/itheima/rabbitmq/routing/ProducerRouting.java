package com.itheima.rabbitmq.routing;

import com.itheima.util.ConnectionUtil;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ProducerRouting {

	public static final String exchangeName = "test_direct";
	public static final String DIRECT_QUEUE_INSERT = "test_direct_queue_insert";
	public static final String DIRECT_QUEUE_UPDATE = "test_direct_queue_update";

	public static void main(String[] args) throws IOException, TimeoutException {

		//获取连接
		Connection connection = ConnectionUtil.getConnection();

		//创建频道
		Channel channel = connection.createChannel();

		//创建交换机
		channel.exchangeDeclare(exchangeName, BuiltinExchangeType.DIRECT, true, false, false, null);

		//创建队列
		channel.queueDeclare(DIRECT_QUEUE_INSERT, true, false, false, null);
		channel.queueDeclare(DIRECT_QUEUE_UPDATE, true, false, false, null);

		//绑定队列到交换机
		channel.queueBind(DIRECT_QUEUE_INSERT, exchangeName, "insert");
		channel.queueBind(DIRECT_QUEUE_UPDATE, exchangeName, "update");

		//发送消息
		String message = "Hello, RabbitMQ. 路由模式。routing key为insert";

		channel.basicPublish(exchangeName, "insert", null, message.getBytes());
		System.out.println("已发送消息：" + message);

		message = "Hello, RabbitMQ. 路由模式。routing key为update";
		channel.basicPublish(exchangeName, "update", null, message.getBytes());
		System.out.println("已发送消息：" + message);

		//释放资源
		channel.close();
		connection.close();
	}
}
