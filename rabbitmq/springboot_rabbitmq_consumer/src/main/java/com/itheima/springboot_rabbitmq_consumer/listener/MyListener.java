package com.itheima.springboot_rabbitmq_consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

	/**
	 * 监听某个队列的消息
	 *
	 * @param message 接受到的消息
	 */
	@RabbitListener(queues = "item_queue")
	public void myListenerA(String message) {
		System.out.println("消费者接受到的消息为：" + message);
	}
}
