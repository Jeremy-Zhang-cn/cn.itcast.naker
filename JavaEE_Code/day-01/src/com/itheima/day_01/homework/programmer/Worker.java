package com.itheima.day_01.homework.programmer;

public class Worker {

	private String name;
	private String id;
	private int salary;

	public Worker() {
	}

	public Worker(String name, String id, int salary) {
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public void work() {
		System.out.println("working");
	}
}
