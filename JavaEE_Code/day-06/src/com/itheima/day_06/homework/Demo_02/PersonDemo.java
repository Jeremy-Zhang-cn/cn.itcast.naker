package com.itheima.day_06.homework.Demo_02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PersonDemo {

	/*
			根据需求完成代码
				1.定义一个Person类
					成员变量：name   age
					构造方法、get和set、toString
				2.创建三个Person对象
					Person("张三",23);
					Person("李四",24);
					Person("张三",23);
				3.将这三个对象存储到Set集合中。(同姓名同年龄的为重复值、不存储)
				4.使用迭代器遍历集合
		 */
	public static void main(String[] args) {

		Person p1 = new Person("张三", 23);
		Person p2 = new Person("李四", 24);
		Person p3 = new Person("张三", 23);

		Set<Person> set = new TreeSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);

		Iterator<Person> it = set.iterator();

		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p);
		}

	}
}
