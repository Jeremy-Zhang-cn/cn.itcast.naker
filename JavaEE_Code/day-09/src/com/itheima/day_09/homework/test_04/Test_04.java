package com.itheima.day_09.homework.test_04;

import java.io.*;

public class Test_04 {

	/*
		分析以下需求，并用代码实现
		项目根路径下有text.txt文件，内容如下：
		我爱黑马
		123456
		利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("day-09/text.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("day-09/text1.txt"));

		String line;
		StringBuilder sb;
		while ((line = br.readLine()) != null) {
			sb = new StringBuilder();
			sb.append(line);
			sb.reverse();
			bw.write(sb.toString());
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
