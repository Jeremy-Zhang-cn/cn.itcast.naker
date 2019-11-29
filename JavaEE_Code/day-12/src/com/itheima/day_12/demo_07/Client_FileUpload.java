package com.itheima.day_12.demo_07;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client_FileUpload {

	/*
		客户端：上传文件至服务器，接收反馈
	 */
	public static void main(String[] args) throws IOException {

		//创建客户端Socket对象（Socket）
		Socket s = new Socket(InetAddress.getLocalHost(), 10010);

		//创建字节流对象 读取客户端的数据
		FileInputStream fis = new FileInputStream(new File("day-12/myPic.jpg"));

		//获取Socket中的字节输出流对象
		OutputStream os = s.getOutputStream();

		//上传文件
		int len;
		byte[] bytes = new byte[1024];
		while ((len = fis.read(bytes)) != -1) {
			os.write(bytes, 0, len);
		}

		//向服务器端写一个结束标记
		s.shutdownOutput();

		//接收服务器发出的反馈
		InputStream is = s.getInputStream();
		len = is.read(bytes);
		System.out.println(new String(bytes, 0, len));

		//释放资源
		fis.close();
		s.close();
	}
}
