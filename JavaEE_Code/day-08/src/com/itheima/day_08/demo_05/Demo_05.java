package com.itheima.day_08.demo_05;

import java.io.File;
import java.util.Arrays;

public class Demo_05 {

	public static void main(String[] args) {

		//File.listRoots: 获取当前计算机中的所有盘符
		File[] files = File.listRoots();
		System.out.println(Arrays.toString(files));

		//boolean isHidden(): 判断一个文件是否为隐藏文件
		File file = new File("D:/itcast/java.txt");
		System.out.println(file.isHidden());

		System.out.println(file.length());

	}
}
