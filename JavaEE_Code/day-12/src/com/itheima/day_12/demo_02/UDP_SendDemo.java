package com.itheima.day_12.demo_02;

import java.io.IOException;
import java.net.*;

public class UDP_SendDemo {

	/*
		UDP发送数据步骤：
			1. 创建发送端的Socket对象（DatagramSocket）
			2. 创建数据，并把数据打包
			3. 调用DatagramSocket对象的方法发送数据
			4.关闭发送端
	 */
	public static void main(String[] args) throws IOException {

		//创建发送端的Socket对象
		DatagramSocket ds = new DatagramSocket();

		//创建数据，并把数据打包
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		String str = "hello";
		byte[] bytes = str.getBytes();
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
				InetAddress.getByName("192.168.17.34"), 10086);
		//调用DatagramSocket对象的方法发送数据
		ds.send(dp);

		//关闭发送端
		ds.close();
	}
}
