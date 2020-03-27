package com.itheima.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-rabbitmq.xml")
public class ProducerTest {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	/**
	 * 只发队列消息
	 * 默认交换机类型为direct
	 * 交换机的名称为空，路由键为队列的名称
	 */

	@Test
	public void queueTest() {
		//路由键与队列同名
		rabbitTemplate.convertAndSend("spring_queue", "只发队列spring_queue的消息");
	}

	/**
	 * 发送广播
	 * 交换机类型为fanout
	 * 绑定到该交换机的所有队列都能够收到消息
	 */
	@Test
	public void fanoutTest() {
		rabbitTemplate.convertAndSend("spring_fanout_exchange","","发送到spring_fanout_exchange交换机的广播消息");
	}

	/**
	 * 通配符
	 * 交换机类型为topic
	 * 匹配路由键的通配符，*表示一个单词，#表示零个或多个单词
	 * 绑定到该交换机的匹配队列能够收到对应消息
	 */

	@Test
	public void topicTest() {
		rabbitTemplate.convertAndSend("spring_topic_exchange", "heima.ack", "发送到spring_topic_exchange交换机的heima.ack消息");
		rabbitTemplate.convertAndSend("spring_topic_exchange", "heima.ack.syn", "发送到spring_topic_exchange交换机的heima.ack.syn消息");
		rabbitTemplate.convertAndSend("spring_topic_exchange", "heima.ack.an", "发送到spring_topic_exchange交换机的heima.ack.an消息");
		rabbitTemplate.convertAndSend("spring_topic_exchange", "itcast.ack", "发送到spring_topic_exchange交换机的itcast.ack消息");

	}

}

