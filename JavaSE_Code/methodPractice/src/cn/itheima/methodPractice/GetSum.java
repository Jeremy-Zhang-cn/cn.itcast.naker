package cn.itheima.methodPractice;

public class GetSum {

	/*
		3、定义一个方法getNumSum，功能是计算1到100所有整数和，并打印输出。
		在main方法中调用getNumSum方法。（无参数无返回值）
	 */
	public static void main(String[] args) {
		getNumSum();
	}

	private static void getNumSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}
