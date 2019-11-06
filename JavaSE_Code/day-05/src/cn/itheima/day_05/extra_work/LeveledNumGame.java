package cn.itheima.day_05.extra_work;

import java.util.Random;
import java.util.Scanner;

public class LeveledNumGame {

	/*
		假如将我们前面学过的猜数字游戏难度等级划分为3种,
		1级难度,随机数的范围是1-10之间,
		2级难度,随机数的范围是1-50之间,
		3级难度,随机数的范围是1-100之间,
		请使用代码的形式完成将猜数字游戏封装成一个方法,
		并在main方法中模拟用户的行为,通过键盘输入一个难度等级,
		实现用户可以玩不同难度的游戏
	 */

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		leveledGame();
	}

	//返回值类型为void
	private static void leveledGame() {

		System.out.println("请选择游戏等级：1.简单（1~10） 2.中等 （1~50) 3.困难 （1~100）:");
		int i = sc.nextInt();

		switch (i) {
			case 1:
				numberGame(10);
				break;

			case 2:
				numberGame(50);
				break;

			case 3:
				numberGame(100);
				break;

			default:
				System.out.println("输入有误");
				break;
		}

	}

	private static void numberGame(int num) {


		Random rd = new Random();
		int seed;
		seed = rd.nextInt(num) + 1;

		while (true) {

			System.out.printf("请输入你要猜的数字（1~%d）：\n",num);
			int guess = sc.nextInt();

			if (guess >= 1 && guess <= num) {

				if (guess > seed) {
					System.out.printf("您猜的数字%d大了，再猜一次吧。\n", guess);
				} else if (guess < seed) {
					System.out.printf("您猜的数字%d小了，再猜一次吧。\n", guess);
				} else {
					System.out.println("恭喜你猜对了！");
					break;
				}
			} else {
				System.out.printf("输入有误，请输入1~%d之间的数字\n", num);
			}

		}
	}
}
