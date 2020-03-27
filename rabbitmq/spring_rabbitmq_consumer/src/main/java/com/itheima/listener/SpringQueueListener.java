package com.itheima.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.io.UnsupportedEncodingException;

public class SpringQueueListener implements MessageListener {


	@Override
	public void onMessage(Message message) {
		try {
			String msg = new String(message.getBody(), "utf-8");
			System.out.printf("接收路由名为：%s, 路由键为:%s, 队列名为: %s的消息：%s\n",
					message.getMessageProperties().getReceivedExchange(),
					message.getMessageProperties().getReceivedRoutingKey(),
					message.getMessageProperties().getConsumerQueue(),
					msg
			);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
