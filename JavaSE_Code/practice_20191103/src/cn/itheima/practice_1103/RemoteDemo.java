package cn.itheima.practice_1103;

import java.util.Scanner;

public class RemoteDemo {

	/*
	*7、模拟遥控器调整音量。定义一个音量，如果值为1，
	* 那么打印输出“音量增大”；如果值为2，那么打印输出“音量减小”；
	* 如果值为3，那么打印输出“关机”；
	* 若值为其他数字，
	* 打印“抱歉，您给出的数字不合法”。（switch语句）
	 */
	public static void main(String[] args) {

		int vol;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		vol = sc.nextInt();

		switch (vol) {

			case 1:
				System.out.println("音量增大");
				break;

			case 2:
				System.out.println("音量减小");
				break;

			case 3:
				System.out.println("关机");
				break;

			default:
				System.out.println("抱歉，您输入的数字不合法。");
				break;
		}
	}
}
