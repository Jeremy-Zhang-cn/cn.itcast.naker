package com.itheima.day_09.demo_05;

import java.io.*;

public class Demo_16 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("day-09/data.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("day-09/data3.txt"));

		String line;	//用于保存读取的字符串
		while ((line = br.readLine()) != null) {
			bw.write(line);	//写入数据
			bw.newLine();	//手动换行
			bw.flush();		//刷新缓冲区
		}

		br.close();
		bw.close();
	}
}
