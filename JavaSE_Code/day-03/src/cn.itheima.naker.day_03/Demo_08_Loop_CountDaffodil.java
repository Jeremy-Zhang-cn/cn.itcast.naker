package cn.itheima.naker.day_03;

public class Demo_08_Loop_CountDaffodil {

	//统计3位水仙花数的个数
	//3位水仙花数：三位数，每一位的三次方相加的和等于这个三位数
	public static void main(String[] args) {

		int count = 0;
		/*
		//for循环实现
		for (int i = 100; i < 1000; i++) {

			int a = i % 10;
			int b = i / 10 % 10;
			int c = i / 100;

			if ( a*a*a + b*b*b + c*c*c == i) {
				count ++;
			}
		}
		System.out.println("共有" + count + "个水仙花数");
		*/


		//while循环实现
		int i = 100;
		while (i < 1000) {

			int a = i % 10;		//获取个位数
			int b = i / 10 % 10;	//获取十位数
			int c = i / 100;	//获取百位数
			if (a * a * a + b * b * b + c * c * c == i) {
				count ++;
			}
			i++;
		}
		System.out.println("共有" + count + "个水仙花数");
	}
}
