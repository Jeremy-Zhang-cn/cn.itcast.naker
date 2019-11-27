package com.itheima.day_08.demo_07;

import java.io.File;

public class Demo_07 {

	/*
		利用递归调用遍历文件夹内容
	 */
	public static void main(String[] args) {

		File file = new File("D:/itcast");
		getAllFiles(file);
	}

	private static void getAllFiles(File srcFile) {

		File[] filesArray = srcFile.listFiles();	//将当前目录下的所有文件或目录存入File数组中
		if (filesArray != null) {	//若数组不为空执行遍历操作
			for (File file : filesArray) {	//遍历File数组
				if (file.isDirectory()) {	//判断对象是否为目录
					getAllFiles(file);	//是：递归调用
				} else {
					System.out.println(file.getAbsolutePath());	//否：获取绝对路径并输出
				}
			}
		}

	}
}
