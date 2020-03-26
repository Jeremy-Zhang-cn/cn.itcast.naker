package com.itheima.rabbitmq.routing;

import com.itheima.util.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class ConsumerRoutingA {

	public static void main(String[] args) throws IOException {
		//获取连接
		Connection connection = ConnectionUtil.getConnection();
		//创建Channel
		Channel channel = connection.createChannel();

		//声明交换机
//		channel.exchangeDeclare(ProducerRouting.exchangeName, BuiltinExchangeType.DIRECT);

		//声明队列
		channel.queueDeclare(ProducerRouting.DIRECT_QUEUE_INSERT, true, false, false, null);

		//绑定队列至交换机
		channel.queueBind(ProducerRouting.DIRECT_QUEUE_INSERT, ProducerRouting.exchangeName, "insert");

		// 接收消息
		Consumer consumer = new DefaultConsumer(channel){
			/*
				回调方法，当收到消息后，会自动执行该方法

				1. consumerTag：标识
				2. envelope：获取一些信息，交换机，路由key...
				3. properties:配置信息
				4. body：数据

			 */
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
				System.out.println("body："+new String(body));
				System.out.println("将日志信息打印到控制台.....");
			}
		};

		channel.basicConsume(ProducerRouting.DIRECT_QUEUE_INSERT, true, consumer);

	}
}
