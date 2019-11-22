package com.itheima.day_06.testDemo;

public class TestDemo {

	public static void main(String[] args) {

		GenericImpl g = new GenericImpl();
		g.show("aaa");
		g.show(11);
		g.show(12.23);
		g.show(new Person("张三"));

	}
}
