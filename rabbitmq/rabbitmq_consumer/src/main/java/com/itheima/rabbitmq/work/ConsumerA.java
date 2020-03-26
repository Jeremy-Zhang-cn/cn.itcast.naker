package com.itheima.rabbitmq.work;

import com.itheima.util.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * work模式：消费者接收消息
 */
public class ConsumerA {
	public static void main(String[] args) throws IOException {

		//创建连接
		Connection connection = ConnectionUtil.getConnection();

		//创建频道
		Channel channel = connection.createChannel();

		//声明队列
		channel.queueDeclare(ProducerWork.QUEUE_NAME, true, false, false, null);

		//每次可以预取多少个消息
		channel.basicQos(1);

		//创建消费者（接受消息并处理消息）
		DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {

			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {

				try {
					//路由key
					System.out.println("路由key：" + envelope.getRoutingKey());
					//交换机
					System.out.println("交换机：" + envelope.getExchange());
					//消息id
					System.out.println("消息id：" + envelope.getDeliveryTag());
					//接收到的消息
					System.out.println("消费者A接收到的消息为：" + new String(body, "utf-8"));

					Thread.sleep(1000);

					//确认消息
					channel.basicAck(envelope.getDeliveryTag(), false);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};

		//监听队列
		channel.basicConsume(ProducerWork.QUEUE_NAME, true, defaultConsumer);
	}
}
