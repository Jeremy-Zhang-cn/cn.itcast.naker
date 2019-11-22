package com.itheima.day_06.testDemo;

public class GenericImpl implements Generic {

	@Override
	public <T> void show(T t) {
		System.out.println(t);
	}

}
