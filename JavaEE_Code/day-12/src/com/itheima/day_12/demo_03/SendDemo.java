package com.itheima.day_12.demo_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {

	/*
		UDP发送数据；
			数据来自于键盘录入，直到输入的数据是886，发送数据结束
	 */
	public static void main(String[] args) throws IOException {

		//创建发送端的Socket对象（DatagramSocket）
		DatagramSocket ds = new DatagramSocket();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}

			//创建数据，并将数据打包
			byte[] bytes = line.getBytes();
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
					InetAddress.getByName("192.168.17.34"), 10010);

			//调用DatagramSocket对象的方法发送数据
			ds.send(dp);

		}

		//关闭发送端
		ds.close();

	}
}
