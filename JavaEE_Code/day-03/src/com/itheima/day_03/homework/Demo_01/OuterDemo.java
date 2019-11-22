package com.itheima.day_03.homework.demo_01;

public class OuterDemo {

	/*
		分析以下需求，并用代码实现
	interface Inter {
		void show();
	}
	class Outer {
		//补齐代码
	}
	public class OuterDemo {
		public static void main(String[] args) {
			  Outer.method().show();
		  }
	}
	要求在控制台输出”HelloWorld”
	 */
	public static void main(String[] args) {

		Outer.method().show();
	}
}
