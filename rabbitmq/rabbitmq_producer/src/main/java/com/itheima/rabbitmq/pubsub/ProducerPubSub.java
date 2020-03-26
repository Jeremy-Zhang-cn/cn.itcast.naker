package com.itheima.rabbitmq.pubsub;

import com.itheima.util.ConnectionUtil;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ProducerPubSub {

	public static void main(String[] args) throws IOException, TimeoutException {

		//创建连接
		Connection connection = ConnectionUtil.getConnection();

		//创建Channel
		Channel channel = connection.createChannel();

		//声明交换机
		/**
		 * 参数：
		 * 	1.exchange：交换机名称
		 * 	2.type： 交换机类型
		 * 		DIRECT("direct"):定向
		 * 		FANOUT("fanout"): 扇形（广播），发送消息到每一个预支绑定队列
		 * 		TOPIC("topic")通配符的方式
		 * 		HEADERS("headers"):参数匹配
		 * 	3. durable：是否持久化
		 * 	4.autoDelete：自动删除
		 * 	5.internal： 内部使用，一般false
		 * 	6.arguments： 参数
		 */

		String exchangeName = "test_fanout";
		//创建交换机
		channel.exchangeDeclare(exchangeName, BuiltinExchangeType.FANOUT, true, false, false, null);

		//创建队列
		String queueA = "test_fanout_queueA";
		String queueB = "test_fanout_queueB";

		channel.queueDeclare(queueA, true, false, false, null);
		channel.queueDeclare(queueB, true, false, false, null);

		//绑定队列和交换机
		/**
		 * queue: 队列名称
		 * exchange： 交换机名称
		 * routingKey: 路由键，绑定规则
		 * 	如果交换机的类型为fanout,routingKey设置为""
		 */

		channel.queueBind(queueA, exchangeName, "");
		channel.queueBind(queueB, exchangeName, "");

		String body = "log: 张三调用了findAll方法。。。日志级别：info";

		//发送消息
		channel.basicPublish(exchangeName, "", null, body.getBytes());

		//释放资源
		channel.close();
		connection.close();
	}
}
