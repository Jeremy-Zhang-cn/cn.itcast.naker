package cn.itheima.naker.day_03.extra_work;

import java.util.Random;

public class extra_work_05_InsetLoop {

	/*
		请设计一个小游戏,在程序启动后,
		可以随机生成一个大小可变的直角三角形(行高在5至10之间);
	 */
	public static void main(String[] args) {

		//利用Random生成一个5至10之间的随机数表示行高;
		Random rd = new Random();
		int h = rd.nextInt(6) + 5;

		System.out.printf("本次随机生成的是行高为：%d的直角三角形\n", h);

		//利用循环嵌套,外循环循环次数就是生成的随机数,内循环循环次数与当前行有关,第一行就循环一次,第2行就循环2次,....以此类推;
		for (int i = 1; i <= h; i++) {

			for (int j = 1; j <= i; j++) {

				//在内循环中输出"*"但不要换行,待内循环结束后再换行即可;
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
