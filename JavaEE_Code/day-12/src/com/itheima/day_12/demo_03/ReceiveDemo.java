package com.itheima.day_12.demo_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {

		//创建接收端的Socket对象（DatagramSocket）
		DatagramSocket ds = new DatagramSocket(10010);
		while (true) {

			//创建一个数据包，用于接收数据
			byte[] bytes = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
			ds.receive(dp);

			//解析数据包，并把数据显示在控制台
			System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));

		}

		//关闭接收端
	//	ds.close();

	}
}
