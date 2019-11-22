package com.itheima.day_06.demo_06;

public class GenericImpl<T> implements Generic<T> {
	@Override
	public void show(T t) {
		System.out.println(t);
	}
}
