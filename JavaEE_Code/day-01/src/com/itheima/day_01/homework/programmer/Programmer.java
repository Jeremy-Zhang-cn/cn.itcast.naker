package com.itheima.day_01.homework.programmer;

public class Programmer extends Worker {

	public Programmer() {
	}

	public Programmer(String name, String id, int salary) {
		super(name, id, salary);	//调用父类Worker中的满参构造方法
	}

	@Override
	public void work() {
		System.out.println("姓名为" + this.getName() + " ,工号为" + this.getId() +
				" ,工资为" + this.getSalary() + "的程序员正在写代码");
	}

}
