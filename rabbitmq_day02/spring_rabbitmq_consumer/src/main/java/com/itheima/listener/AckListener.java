package com.itheima.listener;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Consumer ACK机制：
 * 1. 设置手动签收。acknowledge="manual"
 * 2. 让监听器类实现ChannelAwareMessageListener接口
 * 3. 如果消息处理成功，则调用channel的basicAck()签收
 * 4. 如果消息处理失败，则调用channel的basicNack()拒绝签收，broker重新发送给consumer
 */
@Component
public class AckListener implements ChannelAwareMessageListener {

	@Override
	public void onMessage(Message message, Channel channel) throws Exception {

		long deliveryTag = message.getMessageProperties().getDeliveryTag();

		try {
			//接收转换消息
			System.out.println(new String(message.getBody()));

			//处理业务逻辑
			System.out.println("处理业务逻辑...");
		//	int i = 1 / 0; //出现错误
			//手动签收
			channel.basicAck(deliveryTag, true);
		} catch (IOException e) {
		//	e.printStackTrace();
			//拒接签收
			/**
			 * 第三个参数requeue：重回队列，如果设置为true，则消息重新回到queue,
			 * broker会重新发送该消息给消费端
			 */

//			channel.basicReject(deliveryTag, true);
			channel.basicNack(deliveryTag, true, true);

		}

	}

}
