package com.itheima.rabbitmq.topics;

import com.itheima.util.ConnectionUtil;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ProducerTopics {

	public static void main(String[] args) throws IOException, TimeoutException {

		Connection connection = ConnectionUtil.getConnection();
		Channel channel = connection.createChannel();

		String exchangeName = "test_topic";

		channel.exchangeDeclare(exchangeName, BuiltinExchangeType.TOPIC, true, false, false, null);

		String queueA = "test_topic_queueA";
		String queueB = "test_topic_queueB";

		channel.queueDeclare(queueA, true, false, false, null);
		channel.queueDeclare(queueB, true, false, false, null);

		channel.queueBind(queueA, exchangeName, "#.error");
		channel.queueBind(queueA, exchangeName, "error.*");
		channel.queueBind(queueB, exchangeName, "*.*");

		String body = "log message: volatile,ventilate,ventricle level: info...";

		channel.basicPublish(exchangeName, "goods.error", null, body.getBytes());

		channel.close();
		connection.close();

	}
}
