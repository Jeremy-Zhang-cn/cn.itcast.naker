package com.itheima.day_03.InnerClass;

public class InnerDemo {

	public static void main(String[] args) {

		Outer.Inner inner = new Outer("李四").new Inner();
		inner.show();
	}
}
