package com.itheima.day_09.demo_03;

import java.io.*;

public class Demo_14 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("day-09/Demo_02.java")));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File("day-09/copy.java")));

		// 一次读取一个字符数组
		int len;
		char[] chs = new char[1024];

		while ((len = isr.read(chs)) != -1) {
			// 写  一次写一个字符数组的一部分
			osw.write(chs,0,len);
			// 刷新缓冲区
			osw.flush();
		}

		osw.close();
		isr.close();

	}
}

