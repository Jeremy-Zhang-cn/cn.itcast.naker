package cn.itheima.practice_1103;

public class MinusDemo {
/*
*4、定义3个int类型变量并赋值，求出最小值，
* 并打印输出到控制台。
 */
	public static void main(String[] args) {

		int a,b,c,t,min;
		a = 23;
		b = 18;
		c = 45;

		t = a > b ? b : a;
		min = t > c ? c : t;

		System.out.println("三个数中最小的数为：" + min);
	}
}
