package cn.itheima.day_05;

public class Demo_01_MethodInit {


	public static void main(String[] args) {

		System.out.println(isOddNum(5));    //带参方法的调用
		int num = 5;
		System.out.println(isOddNum(5));

	}


	public static boolean isOddNum(int num) {    //方法的定义

		return num % 2 != 0;    //方法体 （判断num是否为奇数）

	}
}
