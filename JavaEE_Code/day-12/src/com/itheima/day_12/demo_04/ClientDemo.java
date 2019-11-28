package com.itheima.day_12.demo_04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {

	/*
		TCP发送数据的步骤：
			1.创建客户端的Socket对象（Socket）
			2.获取输入流， 写数据
			3.释放资源
	 */
	public static void main(String[] args) throws IOException {

		//创建客户端的Socket对象（Socket）
		//Socket(InetAddress address, int port): 创建流套接字并将其连接到制定的ip地址的指定端口
		Socket s = new Socket("192.168.17.34", 10010);

		//获取输出流，写数据
		//OutputStream getOutputStream() 返回此套接字的输出流
		OutputStream os = s.getOutputStream();
		os.write("hello".getBytes());

		//释放资源
		s.close();
	}
}
