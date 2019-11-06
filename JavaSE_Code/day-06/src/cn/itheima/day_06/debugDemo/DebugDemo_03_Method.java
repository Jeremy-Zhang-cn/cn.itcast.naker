package cn.itheima.day_06.debugDemo;

public class DebugDemo_03_Method {

	public static void main(String[] args) {

		/*
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("输入第一个数：");
		a = sc.nextInt();
		System.out.println("输入第二个数：");
		b = sc.nextInt();

		int max = getMax(a, b);
		System.out.println("最大值为：" + max);
		*/

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("--------");

	}

	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}
}
