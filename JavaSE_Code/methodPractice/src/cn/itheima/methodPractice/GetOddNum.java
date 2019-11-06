package cn.itheima.methodPractice;

public class GetOddNum {

	/*
		7、定义一个方法，该方法可以求出1到100之间所有奇数的个数，并将个数返回。
		在main方法中调用该方法，并在控制台打印出结果。（无参数有返回值）
	 */
	public static void main(String[] args) {
		System.out.println(getNum());
	}

	private static int getNum() {

		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		return count;
	}
}
