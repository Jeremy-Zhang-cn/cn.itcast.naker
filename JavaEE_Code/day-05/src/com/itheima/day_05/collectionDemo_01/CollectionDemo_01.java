package com.itheima.day_05.collectionDemo_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo_01 {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<>();
		c.add("hello");
		c.add("world");
		c.add("!!!");

		//迭代器
		Iterator<String> iterator = c.iterator();

		//当迭代器中有下一个元素时，获取下一个元素
		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
	}
}
