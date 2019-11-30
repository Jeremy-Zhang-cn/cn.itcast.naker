package com.itheima.day_12.demo_08;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket(InetAddress.getLocalHost(), 10010);

		FileInputStream fis = new FileInputStream(new File("day-12/myPic.jpg"));

		//上传数据
		OutputStream os = socket.getOutputStream();
		int len;
		byte[] bytes = new byte[1024];
		while ((len = fis.read(bytes)) != -1) {
			os.write(bytes, 0, len);
		}

		//向服务器端发送终止标志
		socket.shutdownOutput();

		//接收服务器发回的反馈
		InputStream is = socket.getInputStream();
		len = is.read(bytes);
		System.out.println(new String(bytes, 0, len));

		fis.close();
		socket.close();
	}
}
