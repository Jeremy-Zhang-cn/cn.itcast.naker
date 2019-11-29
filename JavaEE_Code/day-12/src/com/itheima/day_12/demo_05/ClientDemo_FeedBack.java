package com.itheima.day_12.demo_05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo_FeedBack {

	/*
		客户端：发送数据，接收服务器反馈
	 */
	public static void main(String[] args) throws IOException {

		//创建客户端的Socket对象（Socket）
		Socket s = new Socket("127.0.0.1",10010);

		//获取输出流，写数据
		OutputStream os = s.getOutputStream();
		os.write("客户端发送Hello,javaEE".getBytes());

		//接收服务器反馈
		InputStream is = s.getInputStream();
		byte[] bytes = new byte[1024];
		int len = is.read(bytes);
		String data = new String(bytes, 0, len);

		System.out.println("客户端：" + data);

		//释放资源
		s.close();
	}
}
