package cn.itheima.day_05;

public class Demo_04_MethodOverride {

	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(2.2, 3.3));
		System.out.println(sum(1, 2, 3));
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void Test(int a, double b) {
		//方法体
	}

	//下文的Test方法与上文Test方法构成了重载，因为参数类型不同，且参数顺序不同。
	// 但是如果参数类型相同，仅参数顺序不同，无法构成重载
	public static void Test(double b, int a) {
		//方法体
	}

}
