package com.itheima.day_08.demo_08;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_08 {
	/*
		利用输出流向文件中写入数据
	 */
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("day-08/fos.txt");	//创建输出流并指向一个文件的路径,若该文件不存在则同时创建文件

		//void write(int b): 一次写一个字节
		fos.write(97);
		//void write(byte[] b): 一次写一个字节数组
		fos.write("abc".getBytes());	//写数据

		//void write(byte[] b, int startIndex, int len): 写一个数组的一部分，从startIndex开始写len个
		String str = "defg";
		fos.write(str.getBytes(), 0 , 2);	//de

		fos.close();	//关流
	}
}
