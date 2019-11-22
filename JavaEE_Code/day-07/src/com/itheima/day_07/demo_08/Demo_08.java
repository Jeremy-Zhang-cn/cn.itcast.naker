package com.itheima.day_07.demo_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo_08 {

	/*
		ArrayList存储学生对象并排序
	 */
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student("张三", 20));
		list.add(new Student("赵六", 20));
		list.add(new Student("李四", 22));
		list.add(new Student("王五", 23));

		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {

				int ageDiff = s2.getAge() - s1.getAge();
				return ageDiff == 0 ? s2.getName().compareTo(s1.getName()) : ageDiff;

			}
		});

		for (Student student : list) {
			System.out.println(student);
		}
	}
}
