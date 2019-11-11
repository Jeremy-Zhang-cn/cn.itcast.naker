package cn.itheima.day_07.homework.management;

public class Coder {

	private String name;
	private int id;
	private int salary;

	public Coder() {
	}

	public Coder(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	void work() {
		System.out.printf("工号为%d 基本工资为%d的程序员正在努力的" +
				"写着代码.....\n", this.id, this.salary);
	}

}
