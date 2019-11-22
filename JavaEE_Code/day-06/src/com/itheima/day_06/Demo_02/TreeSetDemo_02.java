package com.itheima.day_06.demo_02;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo_02 {

	/*
		按总成绩降序排列集合内的对象
	 */
	public static void main(String[] args) {

		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {

				//主要判断条件，总成绩差值
				int num1 = s2.getSum() - s1.getSum();
				//次要判断条件1，语文成绩差值
				int num2 = num1 == 0 ? s2.getChinese() - s1.getChinese() : num1;
				//次要判断条件2，姓名差值
				int num3 = num2 == 0 ? s2.getName().compareTo(s1.getName()) : num2;

				return num3;
			}
		});

		set.add(new Student("张三", 98, 97));
		set.add(new Student("李四", 99, 96));
		set.add(new Student("王五", 98, 97));
		set.add(new Student("赵六", 95, 97));
		set.add(new Student("赵六", 95, 97));

		for (Student student : set) {
			System.out.println(student + " ," + student.getSum());
		}
	}
}
