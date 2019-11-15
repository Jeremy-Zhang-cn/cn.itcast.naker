package com.itheima.day_01.homework.student;

public class StudentDemo {

	/*
		分析以下需求，并用代码实现
    (1)已知学生类和老师类如下：
        a.属性:姓名,年龄
        b.行为:吃饭
            老师有特有的方法:讲课
            学生有特有的方法:学习
    (2)要求:向上抽取一个父类,让这两个类都继承这个父类,
    	共有的属性写在父类中，子类重写父类中的方法
        编写测试类:完成这两个类的测试
	 */
	public static void main(String[] args) {
		Student student = new Student("张三", 18);
		Teacher teacher = new Teacher("李四", 30);

		System.out.println(student.getName() + " ," + student.getAge());
		student.eat();
		student.study();
		System.out.println("---------");
		System.out.println(teacher.getName() + " ," + teacher.getAge());
		teacher.eat();
		teacher.teach();
	}
}
