package com.itheima.day_10.demo_07;

import java.io.*;

public class Demo_07 {

	/*
		使用PrintWriter复制文本文件
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader
				(new File("day-10/Demo_02.java")));

		PrintWriter pw = new PrintWriter(new FileWriter
				(new File("day-10/copy.java"), true), true);

		String line;
		while ((line = br.readLine()) != null) {
			pw.println(line);
		}

		br.close();
		pw.close();
	}
}
