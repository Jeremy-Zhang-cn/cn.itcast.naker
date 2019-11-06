package cn.itheima.methodPractice;

public class PrintHello_LoopFor {

	/*
		2、定义一个方法printHW100，功能是打印100次“hello world”。
		在main方法中调用printHW100方法。（无参数无返回值）
	 */
	public static void main(String[] args) {
		printHW100();
	}

	private static void printHW100() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello World");
		}
	}
}
