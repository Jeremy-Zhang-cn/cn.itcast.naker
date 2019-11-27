package com.itheima.day_09.homework.test_07;

import java.io.File;
import java.util.ArrayList;

public class Test_07 {

	/*
			分析以下需求，并用代码实现
			键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中,
			每种类型的文件及个数

			输出结果：
				docx类型的文件有  1 个
				java类型的文件有  24 个
				txt类型的文件有  10 个
		//...
	 */
	private static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {

		File srcFile = new File("D:/itcast");
		ArrayList<String> fileList = getAllFiles(srcFile);

		int docxCount = 0;
		int javaCount = 0;
		int txtCount = 0;
		int otherCount = 0;

		for (String s : fileList) {
			if (s.endsWith(".docx")) {
				docxCount++;
			} else if (s.endsWith(".java")) {
				javaCount++;
			} else if (s.endsWith(".txt")) {
				txtCount++;
			} else {
				otherCount++;
			}
		}

		System.out.println("docx类型的文件有" + docxCount + "个");
		System.out.println("java类型的文件有" + javaCount + "个");
		System.out.println("txt类型的文件有" + txtCount + "个");
		System.out.println("其他类型的文件有" + otherCount + "个");

	}

	private static ArrayList<String> getAllFiles(File file) {

		if (file != null) {
			File[] allFiles = file.listFiles();
			if (allFiles != null) {
				for (File all : allFiles) {
					if (all.isDirectory()) {
						getAllFiles(all);
					} else {
						list.add(all.getName());
					}
				}
			}
		}
		return list;
	}
}
