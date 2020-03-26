package com.itheima.rabbitmq.simpleQueue;

import com.itheima.rabbitmq.simpleQueue.Producer;
import com.itheima.util.ConnectionUtil;


import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * 简单模式：消费者接收消息
 */
public class Consumer {

	public static void main(String[] args) throws IOException {
		//创建连接工厂，创建连接（抽取一个获取连接的工具类）
		Connection connection = ConnectionUtil.getConnection();
		//创建频道
		Channel channel = connection.createChannel();
		//声明队列
		/**
		 * 参数1：队列名称
		 * 参数2：是否定义持久化队列（消息会持久化保存在服务器上）
		 * 参数3：是否独占本连接
		 * 参数4：是否在不使用的时候队列自动删除
		 * 参数5：其它参数
		 */
		channel.queueDeclare(Producer.QUEUE_NAME, true, false, false, null);

		//创建消费者
		DefaultConsumer defaultConsumer = new DefaultConsumer(channel){
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
				//路由key
				System.out.println("路由key为：" + envelope.getRoutingKey());
				//交换机
				System.out.println("交换机为：" + envelope.getExchange());
				//消息id
				System.out.println("消息id为：" + envelope.getDeliveryTag());
				//接收到的消息
				System.out.println("接收到的消息为：" + new String(body, "utf-8"));
			}
		};

		//监听队列
		/**
		 * 参数1：队列名
		 * 参数2：是否要自动确认。设置为true表示小细节受到自动向MQ回复接收到了，
		 * MQ则会将消息从队列中删除；如果设置为false则需要手动确认
		 * 参数3：消费者
		 */

		channel.basicConsume(Producer.QUEUE_NAME, true, defaultConsumer);
	}
}
