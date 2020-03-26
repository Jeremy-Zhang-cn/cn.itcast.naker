package com.itheima.rabbitmq.pubsub;

import com.itheima.util.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class ConsumerB {

	public static void main(String[] args) throws IOException {

		//创建连接
		Connection connection = ConnectionUtil.getConnection();

		//创建Channel
		Channel channel = connection.createChannel();
		String queueB = "test_fanout_queueB";

		/**
		 * 参数：
		 * 	1.queue：队列名称
		 * 	2. autoAck: 是否自动确认
		 * 	3. callback: 回调对象
		 */

		DefaultConsumer consumer = new DefaultConsumer(channel){

			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
				System.out.println("Exchange:" + envelope.getExchange());
				System.out.println("RoutingKey:" + envelope.getRoutingKey());
				System.out.println("properties:" + properties);
				System.out.println("body:" + new String(body));
				System.out.println("打印日志信息至控制台。。。");
			}
		};

		channel.basicConsume(queueB, true, consumer);
	}

}
