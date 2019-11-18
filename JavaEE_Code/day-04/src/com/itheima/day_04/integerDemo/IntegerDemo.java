package com.itheima.day_04.integerDemo;

public class IntegerDemo {

	public static void main(String[] args) {

		//创建Integer类型数据
		//方式1：
		Integer integer = new Integer(101);	//已过时
		//方式2：
		Integer integer2 = Integer.valueOf(101);

		//将int类型的数据转换成String类型
		//方式1：(推荐使用)
		int i1 = 100;
		String s1 = "" + i1;
		System.out.println(s1);

		//方式2:
		String s2 = String.valueOf(i1);
		System.out.println(s2);

		//将String类型的数据转换成int类型
		//方式1：
		String s3 = "123";
		Integer integer1 = Integer.valueOf(s3);
		int i2 = integer1.intValue();
		System.out.println(i2);

		//方式2：(必须掌握)
		int num = Integer.parseInt(s3);
		System.out.println(num);

	}
}
