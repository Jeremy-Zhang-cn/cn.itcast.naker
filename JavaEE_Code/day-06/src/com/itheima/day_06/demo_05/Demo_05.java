package com.itheima.day_06.demo_05;

public class Demo_05 {

	public static void main(String[] args) {

		/*Generic<String> stringGeneric = new Generic<>();
		stringGeneric.show("aaa");
		Generic<Integer> integerGeneric = new Generic<>();
		integerGeneric.show(11);
		Generic<Double> doubleGeneric = new Generic<>();
		doubleGeneric.show(12.23);*/

		//泛型方法形式调用
		Generic g = new Generic();
		g.show("aaa");
		g.show(11);
		g.show(12.23);

	}
}
