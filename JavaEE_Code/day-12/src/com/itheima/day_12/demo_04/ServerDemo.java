package com.itheima.day_12.demo_04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	/*
		TCP接收数据的步骤：
			1.创建服务器的Socket对象（ServerSocket）
			2.获取输入流，读数据，并把数据显示在控制台
			3.释放资源
	 */
	public static void main(String[] args) throws IOException {

		//创建服务器的Socket对象（ServerSocket）
		//ServerSocket(int port) 创建绑定到指定端口的服务器套接字
		ServerSocket ss = new ServerSocket(10010);

		//Socket.accept(): 侦听要连接到此的套接字并接收它
		Socket accept = ss.accept();

		//获取输入流，读数据，并把数据显示在控制台
		InputStream is = accept.getInputStream();
		byte[] bytes = new byte[1024];
		PrintWriter pw = new PrintWriter(new FileWriter("day-12/ss.txt", true), true);

		int len;
		while ((len = is.read(bytes))!= -1) {

			String data = new String(bytes, 0, len);
			System.out.println("数据是：" + data);
			pw.println(data);

		}

		//释放资源
		ss.close();
		accept.close();
		pw.close();
	}
}
