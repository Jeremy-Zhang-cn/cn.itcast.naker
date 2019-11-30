package com.itheima.day_12.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	/*
		服务器端：接收文件，给出反馈
	 */
	public static void main(String[] args) throws IOException {

		//创建服务器端Socket对象（ServerSocket）
		ServerSocket ss = new ServerSocket(10010);

		//创建字节输出流
		FileOutputStream fos = new FileOutputStream(new File("D:/itcast/ssCopy.txt"));

		//监听客户端
		Socket s = ss.accept();

		//获取socket的输入流对象
		InputStream is = s.getInputStream();

		//写入数据
		int len;
		byte[] bytes = new byte[1024];
		while ((len = is.read(bytes)) != -1) {
			fos.write(bytes, 0, len);
		}

		//向客户端发送反馈
		OutputStream os = s.getOutputStream();
		os.write("接收成功".getBytes());

		//释放资源
		fos.close();
		ss.close();
	}
}
