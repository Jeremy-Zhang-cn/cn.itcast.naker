package com.itheima.day_06.Demo_04;

public class Student<T> {

	private T t;

	public Student() {
	}

	public Student(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
