package com.itheima.exam.Test_01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UpServer {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(10010);

		while (true) {
			Socket s = ss.accept();

			new Thread() {
				@Override
				public void run() {
					try {
						BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
						BufferedOutputStream bos = new BufferedOutputStream(
								new FileOutputStream(System.currentTimeMillis() + ".txt"));

						byte[] bytes = new byte[1024 * 8];
						int len;
						while ((len = bis.read(bytes))!= -1) {
							bos.write(bytes, 0, len);
							bos.flush();
						}

						BufferedWriter bwServer = new BufferedWriter(
								new OutputStreamWriter(s.getOutputStream()));
						bwServer.write("上传成功");
						bwServer.newLine();
						bwServer.flush();
						bos.close();
						bis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}finally {
						try {
							s.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();
		}
	}
}
