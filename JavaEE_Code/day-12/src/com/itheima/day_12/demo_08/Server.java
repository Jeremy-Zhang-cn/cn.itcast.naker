package com.itheima.day_12.demo_08;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(10010);

		while (true) {

			//监听客户端
			Socket s = ss.accept();

			//开启上传线程
			new Thread(new ServerThread(s)).start();

		}

	}
}
