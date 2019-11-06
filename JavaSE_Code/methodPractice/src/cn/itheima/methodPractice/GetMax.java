package cn.itheima.methodPractice;

public class GetMax {

	/*
		11、定义一个方法，功能是接收3个整数，求出三数中的最大值，并把结果返回。
		在main方法中调用该方法，并在控制台打印出最大值。（有参数有返回值）
	 */
	public static void main(String[] args) {
		System.out.println("三个数的最大值是：" + getMax(10,20,30));
	}

	private static int getMax(int a, int b, int c) {
		int t = Math.max(a, b);
		return Math.max(t, c);
	}
}
