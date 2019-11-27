package com.itheima.day_09.demo_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo_13 {

	public static void main(String[] args) throws IOException {

		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day-09/osw.txt"));
		//void write(int c): 写一个字符
		osw.write(97);
		osw.flush();

		//void write(char[] c): 写入一个字符数组
		char[] chs = {'a', 'b', 'c'};
		osw.write(chs);
		osw.flush();

		//void write(char[] c, int off, int len): 写入字符数组的一部分

		osw.write(chs, 0, chs.length);
		osw.write("\r\n");
		osw.write(chs, 1, 2);
		osw.flush();

		//void write(String str):写一个字符串
		osw.write("abcdefg");
		osw.write("\r\n");

		//void write(String str, int off, int len): 写一个字符串的一部分
		osw.write("abcde", 1, 3);
		osw.write(100);
		osw.close();
	}
}
