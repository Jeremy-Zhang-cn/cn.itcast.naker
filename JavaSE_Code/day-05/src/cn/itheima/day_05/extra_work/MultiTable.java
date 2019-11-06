package cn.itheima.day_05.extra_work;

public class MultiTable {

	/*
		打印输出九九乘法表
	 */
	public static void main(String[] args) {
		multiTable();
	}

	private static void multiTable() {
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.printf("%d * %d = %d\t", j, i, (i * j));
			}
			System.out.println();
		}
	}
}
