package com.itheima.day_08.demo_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_11 {

	/*
		复制图片
	 */
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:/itcast/mypic.jpg");
		FileOutputStream fos = new FileOutputStream("day-08/copypic.jpg");

		int len;
		byte[] bytes = new byte[1024];

		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes, 0 ,len);
		}

		fis.close();
		fos.close();

	}
}
