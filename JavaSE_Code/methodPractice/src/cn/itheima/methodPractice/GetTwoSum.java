package cn.itheima.methodPractice;

public class GetTwoSum {

	/*
		10、定义一个方法，功能是接收两个整数，并计算两数和，把结果返回。
		在main方法中调用该方法，并在控制台打印求和的结果。（有参数有返回值）
	 */
	public static void main(String[] args) {
		System.out.println("两数之和为：" + getSum(10, 20));
	}

	private static int getSum(int a, int b) {
		return a + b;
	}
}
