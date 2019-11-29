package com.itheima.day_12.demo_05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo_FeedBack {

	/*
		服务器：接收数据，给出反馈
	 */
	public static void main(String[] args) throws IOException {

		//创建服务器端的Socket对象（ServerSocket）
		ServerSocket ss = new ServerSocket(10010);

		//监听客户端连接，返回一个Socket对象
		Socket s = ss.accept();

		//获取输入流，读数据，并把数据显示在控制台
		InputStream is = s.getInputStream();

		byte[] bytes = new byte[1024];
		int len = is.read(bytes);
		String data = new String(bytes, 0, len);
		System.out.println("服务器：" + data);

		//给出反馈
		OutputStream os = s.getOutputStream();
		os.write("服务器收到信息".getBytes());

		//释放资源
		ss.close();

	}
}
