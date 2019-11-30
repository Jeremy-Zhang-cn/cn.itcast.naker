package com.itheima.day_12.demo_08;

import java.io.*;
import java.net.Socket;
import java.util.Random;

public class ServerThread implements Runnable {

	Socket s;

	public ServerThread() {
	}

	public ServerThread(Socket s) {
		this.s = s;
	}



	@Override
	public void run() {

		try {
			InputStream is = s.getInputStream();
			//文件名规则：公司域名+当前系统时间的毫秒值+随机的六位数
			String fileName = "itcast" + System.currentTimeMillis() + new Random().nextInt(999999);
			FileOutputStream fos = new FileOutputStream(new File("D:/itcast/"+fileName+".jpg"));

			//写入数据
			int len;
			byte[] bytes = new byte[1024];
			while ((len = is.read(bytes)) != -1) {
				fos.write(bytes,0, len);
			}

			//给出反馈
			OutputStream os = s.getOutputStream();
			os.write("文件上传成功".getBytes());

			//释放资源
			fos.close();
			is.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
