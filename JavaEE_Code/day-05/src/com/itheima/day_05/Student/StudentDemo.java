package com.itheima.day_05.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {

	//	List<Student> list = new ArrayList<>();
		LinkedList<Student> list = new LinkedList<>();

		Student stu1 = new Student("张三", 20);
		Student stu2 = new Student("李四", 22);
		Student stu3 = new Student("王五", 21);
		Student stu4 = new Student("赵六", 23);

		list.add(stu1);
		list.add(stu2);
		list.add(stu3);

		list.add(0, stu4);	//在指定位置插入指定元素
		Student remove = list.remove(0);	//删除指定索引位置的元素，返回删除的元素
		System.out.println(remove);

		list.removeLast();	//删除并返回最后一个元素


		list.set(0, stu3);	//修改指定索引处的元素，返回被修改的元素
		Student student = list.get(0);//返回指定索引处的元素
		System.out.println(student);

		for (Student stu : list) {
			System.out.println(stu);
		}
	}

}
