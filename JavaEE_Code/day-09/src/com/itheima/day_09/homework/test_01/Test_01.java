package com.itheima.day_09.homework.test_01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test_01 {

	/*
		分析以下需求，并用代码实现
	实现一个验证码小程序，要求如下：
	1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，
	 并存入data.txt中，要求一个验证码占一行；
	2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：
	   在控制台提示验证成功，如果不存在控制台提示验证失败
	 */
	public static void main(String[] args) {

		FileOutputStream fos = null;
		FileInputStream fis = null;

		try {
			fos = new FileOutputStream ("day-09/data.txt");
			fis = new FileInputStream("day-09/data.txt");
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < 3; i++) {
				System.out.printf("输入第%d个验证码:\n", i + 1);
				String str = sc.nextLine();
				fos.write(str.getBytes());
				fos.write("\r\n".getBytes());
			}

			String s;
			StringBuilder sb = new StringBuilder();

			int len;
			byte[] bytes = new byte[256];
			while ((len = fis.read(bytes)) != -1) {
				s = new String(bytes, 0, len);
				sb.append(s);
			}
			s = sb.toString();
			String[] strings = s.split("\r\n");	//分割字符串
			System.out.println("请输入验证码：");
			s = sc.nextLine();

			int sum = 0;
			//比对，计数
			for (String string : strings) {
				if (s.equals(string)) sum++;
			}
			if (sum != 0) {
				System.out.println("验证成功");
			} else {
				System.out.println("验证失败");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

				try {
					if (fos != null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (fis != null) fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

		}
	}
}
