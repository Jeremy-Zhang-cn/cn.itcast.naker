package com.itheima.day_06.demo_06;

public class Demo_06 {

	public static void main(String[] args) {

		GenericImpl<String> g1 = new GenericImpl<>();
		g1.show("aaa");
		GenericImpl<Integer> g2 = new GenericImpl<>();
		g2.show(11);
		GenericImpl<Double> g3 = new GenericImpl<>();
		g3.show(12.23);

	}
}
