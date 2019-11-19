package com.itheima.day_05.homework.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	/*
		定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
		A：使用迭代器遍历集合。
		B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
	 */
	public static void main(String[] args) {

		Student student1 = new Student("张三", 19, "男");
		Student student2 = new Student("李四", 29, "男");
		Student student3 = new Student("赵六", 29, "女");

		List<Student> list = new ArrayList<>();

		list.add(student1);
		list.add(student2);
		list.add(student3);

		Iterator<Student> iterator = list.iterator();
		int maxAge = 0;

		while (iterator.hasNext()) {
			Student next = iterator.next();
			if (next.getAge() > maxAge) {
				maxAge = next.getAge();
			}
			System.out.println(next);
		}

		System.out.println("~~~~~~~~~~~~~~");

		for (Student student : list) {
			if (student.getAge() == maxAge) {
				student.setName("小猪佩奇");
			}
			System.out.println(student);
		}
	}
}
