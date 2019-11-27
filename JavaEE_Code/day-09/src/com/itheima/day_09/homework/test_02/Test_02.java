package com.itheima.day_09.homework.test_02;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test_02 {

	/*
		分析以下需求，并用代码实现
			1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
			2. user.txt文件中初始存放的用户信息有如下：
				jack,123
				rose,123
				tom,123
			3.要求完成如下功能：
			  程序运行时：控制台提示用户输入注册的用户名和密码；
			   验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
			   是：控制台提示：用户名已存在
			   否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；
	 */
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();

		BufferedReader br = new BufferedReader(new FileReader("day-09/user.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("day-09/user.txt",true));

		String s;
		ArrayList<String> list = new ArrayList<>();
		while ((s = br.readLine()) != null) {
			String trim = s.trim();	//去空格
			String[] split = trim.split(",");	//分割字符串
			list.add(split[0]);
		}

		if (list.contains(userName)) {
			System.out.println("用户名已存在");
		} else {
			bw.newLine();
			bw.write(userName);
			bw.write(",");
			bw.write(password);
			bw.flush();
			System.out.println("注册成功");
		}

		br.close();
		bw.close();

	}
}
