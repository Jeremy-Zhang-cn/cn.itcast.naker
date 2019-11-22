package com.itheima.day_06.demo_07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_07 {

	/*
		类型通配符
	 */
	public static void main(String[] args) {

		//类型通配符：<?>	?代表任意类型，仅仅代表各种泛型list的父类，并不能把元素添加到其中
		List<?> list1 = new ArrayList<Object>();
		List<?> list2 = new ArrayList<Number>();
		List<?> list3 = new ArrayList<Integer>();

		//类型通配符上限：<? extends 类型>
		List<? extends Number> list4 = new ArrayList<Number>();
		List<? extends Number> list5 = new ArrayList<Integer>();
		//List<? extends Number> list6 = new ArrayList<Object>();	//上限为Number类型，不能继续向上至Number的父类

		//类型通配符下限：<? super 类型>
		List<? super Number> list7 = new ArrayList<Object>();
		List<? super Number> list8 = new ArrayList<Number>();
	//	List<? super Number> list9 = new ArrayList<Integer>();	//下限为Number，不能继续向下至Number的子类

	}
}
