package com.itheima.day_12.demo_07;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_FileUpload {

	/*
		服务器端：接收字节流文件，给出反馈
	 */
	public static void main(String[] args) throws IOException {

		//创建服务器端Socket对象（ServerSocket）
		ServerSocket ss = new ServerSocket(10010);

		//监听从客户端发送过来的数据
		Socket s = ss.accept();

		//获取socket中的字节输入流对象
		InputStream is = s.getInputStream();

		//创建服务器端的字节输出流对象
		FileOutputStream fos = new FileOutputStream(new File("D:/itcast/copy.jpg"));

		//写入数据
		int len;
		byte[] bytes = new byte[1024];
		while ((len = is.read(bytes)) != -1) {
			fos.write(bytes, 0, len);
		}

		//向客户端发送反馈消息
		OutputStream os = s.getOutputStream();
		os.write("文件上传成功".getBytes());

		//释放资源
		fos.close();
		ss.close();

	}
}
