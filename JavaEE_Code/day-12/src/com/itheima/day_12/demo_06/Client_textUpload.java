package com.itheima.day_12.demo_06;

import java.io.*;
import java.net.Socket;

public class Client_textUpload {

	/*
		客户端：数据来自于文本文件
	 */
	public static void main(String[] args) throws IOException {

		//创建客户端Socket对象
		Socket s = new Socket("127.0.0.1", 10010);

		//封装文本文件的数据，读取的事客户端本地的文件
		BufferedReader br = new BufferedReader(new FileReader("day-12/ClientDemo.java"));
		//封装输出流写数据
		//将本地的文件发送给服务器端
	//	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
		String line;
		while ((line = br.readLine()) != null) {
			pw.println(line);
		}

		//释放资源
		br.close();
		s.close();
	}
}
