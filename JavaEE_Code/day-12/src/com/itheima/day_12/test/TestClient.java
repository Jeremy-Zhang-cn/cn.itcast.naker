package com.itheima.day_12.test;

import java.io.*;
import java.net.Socket;

public class TestClient {

	/*
		客户端：发送文件至服务器端，接收服务器反馈信息
	 */
	public static void main(String[] args) throws IOException {

		//创建Socket对象（Socket）
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 10010);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//创建字节输入流
		FileInputStream fis = new FileInputStream(new File("day-12/ss.txt"));


		//获取socket的字节输出流对象
		OutputStream os = socket.getOutputStream();

		int len;
		byte[] bytes = new byte[1024];
		while ((len = fis.read(bytes)) != -1) {
			os.write(bytes);
		}

		//向服务器发送结束标志
		socket.shutdownOutput();

		//获取客户端的反馈
		InputStream is = socket.getInputStream();
		len = is.read(bytes);
		System.out.println(new String(bytes, 0, len));

		//释放资源
		fis.close();
		socket.close();


	}
}
