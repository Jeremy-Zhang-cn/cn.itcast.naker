package cn.itheima.day_06.demoSummary;

public class RabbitDemo {

	/*
		斐波那契数列问题
			斐波那契数列前n项：1,1,2,3,5,8...（从第3项起后一个数等于前两数之和）
	 */

	public static void main(String[] args) {

	//	System.out.println(fibonacci(20));

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum += fibonacci(i);
		}
		System.out.println("第二十天的兔子总对数为：" + sum + " 对");
	}


	private static int fibonacci(int n) {	//递归调用方法求斐波那契数列第n项
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
