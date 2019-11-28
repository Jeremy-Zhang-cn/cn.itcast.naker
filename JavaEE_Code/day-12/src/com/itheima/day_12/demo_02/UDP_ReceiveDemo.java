package com.itheima.day_12.demo_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_ReceiveDemo {

	/*
		UDP接收数据的步骤：
			1. 创建接收端的Socket对象（DatagramSocket）
			2. 创建一个数据包，用于接收数据
			3. 调用DatagramSocket对象的方法接收数据
			4. 解析数据包
			5. 关闭接收端
	 */
	public static void main(String[] args) throws IOException {

		//创建接收端的Socket对象
		//DatagramSocket(int port)构造数据报套接字并将其绑定到本地主机的制定端口
		DatagramSocket ds = new DatagramSocket(10086);

		//创建一个数据包，用于接收数据
		byte[] bytes = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

		//调用DatagramSocket对象的方法接收数据
		ds.receive(dp);

		//解析数据包,在控制台显示
		//byte[] getData()： 返回数据缓冲区
		byte[] data = dp.getData();
		String s = new String(data, 0 ,dp.getLength());
		System.out.println("数据是：" + s);

		//关闭接收端
		ds.close();
	}
}
