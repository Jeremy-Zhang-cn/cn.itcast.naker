package com.itheima.exam.Test_01;

import java.io.*;
import java.net.Socket;

public class UpClient {

	public static void main(String[] args) {
		Socket s = null;
		BufferedInputStream bis = null;

		try {
			s = new Socket("127.0.0.1", 10010);
			File file = new File("exam/a.txt");
			if (!file.exists() || !file.isFile() || !file.getName().endsWith(".txt")) {
				System.out.println("文件路径不对");
				return;
			}

			bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());

			byte[] bytes = new byte[1024 * 8];
			int len;
			while ((len = bis.read(bytes)) != -1) {
				bos.write(bytes, 0, len);
				bos.flush();
			}

			s.shutdownOutput();

			BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String data = brClient.readLine();
			System.out.println("服务器反馈：" + data);
			brClient.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
