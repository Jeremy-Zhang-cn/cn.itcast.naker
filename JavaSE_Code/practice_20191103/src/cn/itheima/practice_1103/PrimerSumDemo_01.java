package cn.itheima.practice_1103;

public class PrimerSumDemo_01 {

	/*
	 *将1到100之间不能被3整除的数字累加求和并打印结果。
	 * 求出1到5之间所有整数之和并打印结果。
	 * 求出1到5之间所有奇数之和并打印结果。
	 * 求出1到5之间所有偶数的个数并打印结果。
	 */
	public static void main(String[] args) {

		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 3 != 0) {
				sum1 += i;
			}
		}

		int sum2 = 0;
		for (int i = 1; i <= 5; i++) {
			sum2 += i;
		}

		int sum3 = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 != 0) {
				sum3 += i;
			}
		}

		int sum4 = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				sum4 += i;
			}
		}

		System.out.printf("1~100之间不能被3整除的数字之和为：%d\n", sum1);
		System.out.printf("1~5之间所有整数和为：%d\n", sum2);
		System.out.printf("1~5之间所有奇数和为：%d\n", sum3);
		System.out.printf("1~5之间所有偶数和为：%d\n", sum4);

	}
}
