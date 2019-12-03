package com.itheima.exam.Test_01;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TestDemo {

	//定义 list 集合,存储符合条件的文件名
	public static ArrayList<String> list=new ArrayList<>();
	public static void main(String[] args) throws IOException {
		File folder = new File("D:/itcast");
		//递归获取文件名
		checkFolder(folder);
		//创建写入流，将集合元素写入到当前目录的 list.txt 文件中，每个元素为一行
		BufferedWriter bw=null;
		//1
		bw = new BufferedWriter(new FileWriter("exam/list.txt"));
		for (String s : list) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		bw.close();
	}
	private static void checkFolder(File folder) throws IOException {
		//判断 folder 是否是文件夹，如果是文件夹则继续递归
		//2
		File[] files = folder.listFiles();
		if (folder.isDirectory()) {
			for (File file : files) {
				if (file.isDirectory()) {
					checkFolder(file);
				} else {
					if (file.getName().endsWith(".java")) {
						list.add(file.getName());
					}
				}
			}
		}
		/*
		 else {
			//判断文件名是否以.java 结尾，如果是将文件名添加到list 集合
			//3

		}*/
	}

}
