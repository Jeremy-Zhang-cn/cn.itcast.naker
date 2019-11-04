package cn.itheima.day_05;

public class Demo_05_MethodCompare {

	public static void main(String[] args) {
		System.out.println(compare(10, 20));
	}

	/*public static boolean compare(int a, int b) {
		System.out.println("int");
		return a == b;
	}
*/
	public static boolean compare(byte a, byte b) {
		System.out.println("byte");
		return a == b;
	}

	public static boolean compare(short a, short b) {
		System.out.println("short");
		return a == b;
	}

	public static boolean compare(long a, long b) {
		System.out.println("long");
		return a == b;
	}

	public static boolean compare(double a, double b) {	//可以兼容几乎所有基本类型
		System.out.println("double");
		return a == b;
	}
}
