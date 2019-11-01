package day_03;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {


		int num,guess;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		num	= rd.nextInt(10) + 1;

		while (true) {

			System.out.println("请输入你要猜的数字（1~10）：");
			guess = sc.nextInt();

			if (guess >= 1 && guess <= 10) {

				if (guess > num) {
					System.out.printf("您猜的数字%d大了，再猜一次吧。\n",guess);
				} else if (guess < num) {
					System.out.printf("您猜的数字%d小了，再猜一次吧。\n", guess);
				} else {
					System.out.println("恭喜你猜对了！");
					break;
				}
			} else {
				System.out.println("输入有误，请输入1~10之间的数字");
			}

		}
	}
}
