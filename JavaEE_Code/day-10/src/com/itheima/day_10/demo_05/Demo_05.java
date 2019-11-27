package com.itheima.day_10.demo_05;

import java.io.*;

public class Demo_05 {

	/*
		多层文件夹的复制
	 */
	public static void main(String[] args) throws IOException {

		File srcFile = new File("D:/itcast");
		File destFile = new File("D:/Demo");

		copy(srcFile, destFile);
	}

	private static void copy(File srcFile, File destFile) throws IOException {

		//判断srcFile是否是一个目录
		if (srcFile.isDirectory()) {
			//拼接目的地路径
			File newFilePath = new File(destFile, srcFile.getName());
			//判断路径是否存在
			if (!newFilePath.exists()) {
				newFilePath.mkdirs();
			}

			//获取数据源目录下所有的文件
			File[] files = srcFile.listFiles();
			for (File file : files) {
				if (file.isFile()) {
					BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
					BufferedOutputStream bos = new BufferedOutputStream(
							new FileOutputStream(new File(newFilePath, file.getName())));

					int len;
					byte[] bytes = new byte[1024];

					while ((len = bis.read(bytes)) != -1) {
						bos.write(bytes, 0, len);
					}

					bos.close();
					bis.close();
				} else if (file.isDirectory()) {
					copy(file,newFilePath);
				}
			}
		}
	}
}
