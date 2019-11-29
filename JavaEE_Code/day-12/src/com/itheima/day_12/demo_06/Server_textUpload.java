package com.itheima.day_12.demo_06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_textUpload {

	public static void main(String[] args) throws IOException {

		//创建服务器端Socket对象（ServerSocket）
		ServerSocket ss = new ServerSocket(10010);

		//监听客户端连接，返回一个对应的Socket对象
		Socket s = ss.accept();

		//接收数据
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//把数据写入文本文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("day-12/copy.java"));

		//写入数据
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		//释放资源
		bw.close();
		ss.close();
	}
}
