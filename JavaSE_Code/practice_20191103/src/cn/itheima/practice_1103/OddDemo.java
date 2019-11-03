package cn.itheima.practice_1103;

public class OddDemo {

	/*
	 *统计并获取10-100之间(包含10和100)个位与十位都为奇数的数字，
	 * 并将数字和个数都打印到控制台上
	 */
	public static void main(String[] args) {

		int count = 0;
		for (int i = 10; i <= 100; i++) {

			int singleDigit = i % 10;
			int tensDigit = i / 10 % 10;

			if (singleDigit % 2 != 0 && tensDigit % 2 != 0) {

				count++;
				System.out.printf("%d \t", i);
				
				if (count % 5 == 0) {
					System.out.println("");
				}

			}

		}
		System.out.println("\n符合条件的数字共有" + count + "个");
	}

}
