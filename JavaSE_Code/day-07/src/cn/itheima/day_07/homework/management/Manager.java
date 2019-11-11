package cn.itheima.day_07.homework.management;

public class Manager {

	private String name;
	private int id;
	private int salary;
	private int bonus;

	public Manager() {
	}

	public Manager(String name, int id, int salary, int bonus) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
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

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	void work() {
		System.out.printf("工号为%d 基本工资为%d 奖金为%d 的项目经理正在努力的做着管理工作," +
				"分配任务,检查员工提交上来的代码.....\n", this.id, this.salary, this.bonus);
	}
}
