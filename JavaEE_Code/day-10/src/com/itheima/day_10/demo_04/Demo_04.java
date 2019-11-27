package com.itheima.day_10.demo_04;

import java.io.*;

public class Demo_04 {

	/*
		复制单层文件夹下的所有文件
	 */
	public static void main(String[] args) throws IOException {

		//源文件
		File srcFile = new File("D:/itcast/songs");
		//目标位置
		File destFile = new File("D:/");

		copyFile(srcFile, destFile);
	}

	private static void copyFile(File srcFile, File destFile) throws IOException {

		//拼接新路径
		File newFilePath = new File(destFile, srcFile.getName());

		//判断路径是否存在，决定是否新建文件夹
		if (!newFilePath.exists()) newFilePath.mkdirs();

		//获取源目录下所有文件
		File[] files = srcFile.listFiles();

		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					copy(newFilePath, file);
				}
			}
		}
	}

	private static void copy(File newFilePath, File file) throws IOException {

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream
				(new File(newFilePath, file.getName())));

		int len;
		byte[] bytes = new byte[1024];
		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes, 0, len);
			bos.flush();
		}

		bis.close();
		bos.close();
	}
}
