package com.itheima.day_06.demo_05;

/*class Generic<T> {

	void show(T t) {
		System.out.println(t);
	}*/

class Generic{

	//泛型方法
	<T> void show(T t) {
		System.out.println(t);
	}
}
