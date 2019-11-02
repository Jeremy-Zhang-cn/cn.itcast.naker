package cn.itheima.naker.day_03;
import java.util.Random;
import java.util.Scanner;
public class RandomNum {
	//猜数游戏
	public static void main(String[] args) {

		int num,guess;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		num = rd.nextInt(10) + 1;

		while (true) {

			System.out.println("请输入你要猜的数字（1~10）：");
			guess = sc.nextInt();

			if (guess >= 1 && guess <= 10) {

				if (guess == num) {
					System.out.println("恭喜你猜对了");
					break;
				} else {
					if (guess > num) {
						System.out.printf("你猜的数字%d大了，再猜一次吧",guess);
					} else {
						System.out.printf("你猜的数字%d小了，再猜一次吧",guess);
					}
				}

			} else {
				System.out.println("输入有误，请输入1~10之间的整数");
			}

		}
	}
}
