package cn.itheima.practice_1103;

public class PrimerSumDemo_02 {

	/*
	 *求1~100以内(包含1和100)能同时被3，5整除的数的和，
	 * 并将求出的和打印到控制台上。
	 */
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100之间能同时被3,5整除的数的和为：" + sum);
	}
}
