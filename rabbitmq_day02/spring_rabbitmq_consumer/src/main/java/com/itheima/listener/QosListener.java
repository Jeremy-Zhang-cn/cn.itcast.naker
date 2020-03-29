package com.itheima.listener;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

/**
 * Consumer限流机制
 * 1. 确保ack机制为手动确认
 * 2. listener-container配置属性
 * 		prefetch=1,表示消费端每次从mq拉取一条消息过来消费，直到手动确认消费完毕后
 * 	才会去拉取下一条消息
 */
@Component
public class QosListener implements ChannelAwareMessageListener {

	private int count = 0;

	@Override
	public void onMessage(Message message, Channel channel) throws Exception {

		Thread.sleep(1000);
		//获取消息
		System.out.println(new String(message.getBody()));
		count++;
		//处理业务逻辑

		//签收
	//	channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
		if (count == 10) {
			//只需要确认一次就可以将10条消息全部确认完毕
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
		}
	}
}
