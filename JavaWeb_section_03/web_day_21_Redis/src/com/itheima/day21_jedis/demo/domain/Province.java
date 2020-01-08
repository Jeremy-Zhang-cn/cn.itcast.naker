package com.itheima.day21_jedis.demo.domain;

public class Province {

	private int id;
	private String name;

	public Province() {
	}

	public Province(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Province{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
