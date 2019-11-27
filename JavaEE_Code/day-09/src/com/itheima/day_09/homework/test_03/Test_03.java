package com.itheima.day_09.homework.test_03;

import java.io.*;

public class Test_03 {

	/*
		分析以下需求，并用代码实现
			项目根路径下有个questions.txt文件内容如下：
				5+5
				150-25
				155*155
				2555/5
			要求：读取内容计算出结果，将结果写入到results.txt文件中
				5+5=10
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("day-09/questions.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("day-09/results.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			if (line.contains("+")) {
				String[] split = line.split("\\+");
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[1]);
				int sum = a + b;
				bw.write(String.valueOf(a));
				bw.write("+");
				bw.write(String.valueOf(b));
				bw.write("=");
				bw.write(String.valueOf(sum));
				bw.newLine();
				bw.flush();
			} else if (line.contains("-")) {
				String[] split = line.split("\\-");
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[1]);
				int minus = a - b;
				bw.write(String.valueOf(a));
				bw.write("-");
				bw.write(String.valueOf(b));
				bw.write("=");
				bw.write(String.valueOf(minus));
				bw.newLine();
				bw.flush();
			} else if (line.contains("*")) {
				String[] split = line.split("\\*");
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[1]);
				int mul = a * b;
				bw.write(String.valueOf(a));
				bw.write("*");
				bw.write(String.valueOf(b));
				bw.write("=");
				bw.write(String.valueOf(mul));
				bw.newLine();
				bw.flush();
			} else if (line.contains("/")) {
				String[] split = line.split("\\/");
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[1]);
				int div = a / b;
				bw.write(String.valueOf(a));
				bw.write("/");
				bw.write(String.valueOf(b));
				bw.write("=");
				bw.write(String.valueOf(div));
				bw.newLine();
				bw.flush();
			}
		}

		bw.close();
		br.close();

	}
}
