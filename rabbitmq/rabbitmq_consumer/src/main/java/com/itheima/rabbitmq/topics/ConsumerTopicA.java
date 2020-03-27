package com.itheima.rabbitmq.topics;

import com.itheima.util.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class ConsumerTopicA {

	public static void main(String[] args) throws IOException {

		Connection connection = ConnectionUtil.getConnection();
		Channel channel = connection.createChannel();

		String queueA = "test_topic_queueA";
		String queueB = "test_topic_queueB";

		Consumer consumer = new DefaultConsumer(channel) {

			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
				System.out.println("body:" + new String(body));
				System.out.println("~~~~~~~~");
			}
		};

		channel.basicConsume(queueA, true, consumer);

	}
}
