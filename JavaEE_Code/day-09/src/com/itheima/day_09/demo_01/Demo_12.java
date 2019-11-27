package com.itheima.day_09.demo_01;

import java.io.*;

public class Demo_12 {

	public static void main(String[] args) throws IOException {

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("day-09/copypic.jpg")));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("day-09/mypic1.jpg")));

	/*
		//一次读取一个字节
		int len;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}

	*/

	//一次读取一个字节数组
		int len;
		byte[] bytes = new byte[1024];
		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes, 0 ,len);
		}

		bis.close();
		bos.close();
	}
}
