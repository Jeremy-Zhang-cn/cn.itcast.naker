package cn.itheima.day_05;

public class Demo_02_GetMax {


	public static void main(String[] args) {

		System.out.println(getMax(12, 45));
		int a = 12;
		int b = 15;
		System.out.println(getMax(a,b));

	}


	public static int getMax(int a, int b) {

		int max;

		return max = a > b ? a : b;

	}
}
