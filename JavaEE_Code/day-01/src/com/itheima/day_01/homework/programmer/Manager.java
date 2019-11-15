package com.itheima.day_01.homework.programmer;

public class Manager extends Worker {

	private int bonus;

	public Manager() {
	}

	public Manager(String name, String id, int salary, int bonus) {
		super(name, id, salary);	//调用父类Worker中的满参构造方法
		this.bonus = bonus;		//对本类中的bonus进行赋值
	}

	@Override
	public void work() {
		System.out.println("姓名为" + this.getName() + " ,工号为" + this.getId() +
				" ,工资为" + this.getSalary() + " ,奖金为" + this.bonus +
				"的项目经理正在管理程序员");
	}
}
