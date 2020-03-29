package com.itheima.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-rabbitmq-producer.xml")
public class ProducerTest {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	/**
	 * 确认模式：
	 * 步骤：
	 * 1. 确认模式开启：ConnectionFactory中开启publisher-confirms="true"
	 * 2. 在rabbitTemplate定义ConfirmCallBack回调函数
	 */
	@Test
	public void testConfirm() {

		//定义回调函数
		rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {

			/**
			 *
			 * @param correlationData 相关配置信息
			 * @param ack   exchange交换机 是否成功收到了消息。true 成功，false代表失败
			 * @param cause 失败原因
			 */

			@Override
			public void confirm(CorrelationData correlationData, boolean ack, String cause) {

				System.out.println("confirm方法被执行了...");

				if (ack) {
					//接收成功
					System.out.println("接收成功消息"+cause);
				} else {
					//接收失败
					System.out.println("接收失败信息" + cause);
					//以一定的方式处理后重发消息
				}
			}
		});

		//发送消息
		rabbitTemplate.convertAndSend("test_exchange_confirm", "confirm", "message confirm...");

	}

	@Test
	public void testReturn() {

		//设置交换机处理失败信息的模式
		rabbitTemplate.setMandatory(true);

		//设置回调函数
		rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {

			/**
			 *
			 * @param message   消息对象
			 * @param replyCode 错误码
			 * @param replyText 错误信息
			 * @param exchange  交换机
			 * @param routingKey 路由键
			 */

			@Override
			public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {

				System.out.println("return 执行了...");
				System.out.println(message);
				System.out.println(replyCode);
				System.out.println(replyText);
				System.out.println(exchange);
				System.out.println(routingKey);
				//处理
			}
		});

		//发送消息
		rabbitTemplate.convertAndSend("test_exchange_confirm", "confirm", "message confirm...");
	}

	@Test
	public void testSend() {
		for (int i = 0; i < 10; i++) {
			//发送消息
			rabbitTemplate.convertAndSend("test_exchange_confirm", "confirm", "message confirm...");

		}
	}

	/**
	 * TTL:过期时间
	 * 1. 队列统一过期
	 * 2. 消息单独过期
	 * <p>
	 * 如果设置了消息的过期时间也设置了队列的过期时间，以时间段的为准
	 * 队列过期后，会将队列所有的消息全部移除
	 * 消息过期后，只有消息在队列顶端，才会判断其是否过期（移除掉）
	 */
	@Test
	public void testTTL() {


      /*  for (int i = 0; i < 10; i++) {
            // 发送消息
            rabbitTemplate.convertAndSend("test_exchange_ttl", "ttl.hehe", "message ttl....");
        }*/

		// 消息后处理对象，设置一些消息的参数信息
		MessagePostProcessor messagePostProcessor = new MessagePostProcessor() {

			@Override
			public Message postProcessMessage(Message message) throws AmqpException {
				//1.设置message的信息
				message.getMessageProperties().setExpiration("5000");//消息的过期时间
				//2.返回该消息
				return message;
			}
		};


		//消息单独过期
		//rabbitTemplate.convertAndSend("test_exchange_ttl", "ttl.hehe", "message ttl....",messagePostProcessor);


		for (int i = 0; i < 10; i++) {
			if(i == 5){
				//消息单独过期
				rabbitTemplate.convertAndSend("test_exchange_ttl", "ttl.hehe", "message ttl....",messagePostProcessor);
			}else{
				//不过期的消息
				rabbitTemplate.convertAndSend("test_exchange_ttl", "ttl.hehe", "message ttl....");

			}

		}

	}

	/**
	 * 发送测试死信消息：
	 * 1. 过期时间
	 * 2. 长度限制
	 * 3. 消息拒收
	 */
	@Test
	public void testDlx() {
		//测试过期时间，死信消息
//		rabbitTemplate.convertAndSend("test_exchange_dlx", "test.dlx.haha", "死信消息");
/*

		//测试长度限制后，消息成为死信
		for (int i = 0; i < 20; i++) {
			rabbitTemplate.convertAndSend("test_exchange_dlx", "test.dlx.haha", "死信消息");

		}
*/

		//测试消息拒收
		rabbitTemplate.convertAndSend("test_exchange_dlx", "test.dlx.haha", "死信消息");
	}

	@Test
	public void testDelay() throws InterruptedException {

		//发送订单消息（将来是在订单系统中，下单成功后发送消息
		rabbitTemplate.convertAndSend("order_exchange", "order.msg", "订单信息：id=1,time=2020年03月27日23:17:59");
		//打印倒计时10秒
		for (int i = 10; i > 0; i--) {
			System.out.println(i + "...");
			Thread.sleep(1000);
		}

	}

}
