package com.itheima.day_06.homework.Demo_04;

import java.util.ArrayList;
import java.util.Collection;

public class Demo_04 {

	public static void main(String[] args) {
		Collection<Integer> list1 = new ArrayList<Integer>();
		Collection<String> list2 = new ArrayList<String>();
		Collection<Number> list3 = new ArrayList<Number>();
		Collection<Object> list4 = new ArrayList<Object>();

		getElement1(list1);
	//	getElement1(list2);
		getElement1(list3);
	//	getElement1(list4);

	//	getElement2(list1);
	//	getElement2(list2);
		getElement2(list3);
		getElement2(list4);

	}

	public static void getElement1(Collection<? extends Number> coll){}

	public static void getElement2(Collection<? super Number> coll){}
}


