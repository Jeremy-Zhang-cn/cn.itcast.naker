package com.itheima.day_01.homework.programmer;

public class TestDemo {

	/*
		分析以下需求，并用代码实现
    (1)项目经理类
        a.属性：姓名 工号 工资(salary) 奖金 //bonus
        b.行为：工作work
    (2)程序员类
        a.属性：姓名 工号 工资
        b.行为：工作work
    (3)要求:向上抽取一个父类,让这两个类都继承这个父类,
    	共有的属性写在父类中，子类重写父类中的方法
        编写测试类:完成这两个类的测试
	 */
	public static void main(String[] args) {

		Programmer p = new Programmer("张三","p001",8000);
		Manager m = new Manager("李四", "pm001", 18000, 6000);

		p.work();
		System.out.println("------------------------------------------");
		m.work();
	}
}
