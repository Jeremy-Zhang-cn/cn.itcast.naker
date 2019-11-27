package com.itheima.day_09.homework.test_06;

import java.io.*;
import java.util.Scanner;

public class Test_06 {

	/*
		分析以下需求，并用代码实现
		模拟歌曲复制和删除过程：
		假设在D：\\songs文件夹中存在一些歌曲(均为mp3格式)
		循环显示该菜单：
		请选择您要进行的操作：
		1：查询所有歌曲
		2：根据歌曲名称复制
		3：根据歌曲名称删除
		4: 退出

	举例：
		用户输入：1
			存在以下歌曲：
				蒙娜丽莎的眼泪
				烟花易冷
				上海滩
				小苹果
				夜空中最亮的星
		用户输入：2
			请输入要复制的歌曲名称: 上海滩
			请输入存储路径: E:\\songs  (说明:该路径如果存在则不创建,不存在则创建)
			复制结果: 歌曲上海滩已经成功复制到E:\\songs目录中
		用户输入：3
			请输入要删除的歌曲名称: 上海滩
			删除结果: 歌曲上海滩已经成功删除
		用户输入: 4
			退出系统
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;

		while (true) {

			System.out.println("--------欢迎使用--------");
			System.out.println("1：查询所有歌曲");
			System.out.println("2：根据歌曲名称复制");
			System.out.println("3：根据歌曲名称删除");
			System.out.println("4: 退出");
			System.out.println("请输入你的选择(1~4):");
			choice = sc.nextInt();

			switch (choice) {

				case 1:
					System.out.println("存在以下歌曲：");
					getSongs();
					break;

				case 2:
					System.out.println("请输入要复制的歌曲名：");
					String songsName, directoryName;
					songsName = sc.next();
					System.out.println("请输入存储路径：");
					directoryName = sc.next();
					File directory = new File(directoryName);

					try {
						String[] s = copySongs(songsName, directory);
						System.out.print("复制结果：");
						System.out.println("歌曲" + s[0] + "已成功复制到" + s[1] + "目录中");
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;

				case 3:
					System.out.println("请输入要删除的歌曲名：");
					String fileName;
					fileName = sc.next();
					deleteSongs(fileName);
					break;

				case 4:
					System.out.println("感谢使用");
					return;

				default:
					System.out.println("输入有误");
					break;
			}

		}
	}

	//获取歌曲名
	private static void getSongs() {

		File file = new File("D:/itcast/songs");
		File[] files = file.listFiles();

		if (files != null) {
			for (File songs : files) {
				String songsName = songs.getName();
				String[] split = songsName.split("\\.");
				System.out.println(split[0]);
			}
		}
	}

	//复制歌曲
	private static String[] copySongs(String songsName, File directoryName) throws IOException {

		String sourceFileName = "D:/itcast/songs/" + songsName + ".mp3";
		File source = new File(sourceFileName);

		File destDir = new File(directoryName,source.getName());
		if (!directoryName.exists()) directoryName.mkdirs();

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream bos;
		bos = new BufferedOutputStream(new FileOutputStream(destDir));

		int len;
		byte[] bytes = new byte[1024];
		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes, 0, len);
			bos.flush();
		}
		bis.close();
		bos.close();

		String[] s = {songsName, directoryName.getName()};
		return s;

	}

	//删除歌曲
	private static void deleteSongs(String songsName) {
		String sourceFileName = "D:/itcast/songs/" + songsName + ".mp3";
		File source = new File(sourceFileName);
		if (source.delete()) {
			System.out.println("歌曲" + songsName + "已成功删除");
		} else {
			System.out.println("歌曲名不存在");
		}
	}
}
