package com.itheima.day16.demo_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

	private String name;
	private int age;
	private Date birthday;
	private String birStr;

	public User() {
	}

	public User(String name, int age, Date birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

	public String getBirStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		if (this.birthday != null) {
			return sdf.format(this.birthday);
		} else {
			return "";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
