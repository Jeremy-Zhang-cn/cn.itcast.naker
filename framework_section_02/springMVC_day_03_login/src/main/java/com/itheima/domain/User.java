package com.itheima.domain;

public class User {

	private Integer id;
	private String username;
	private String password;
	private String nickname;
	private String gender;
	private Integer age;
	private String address;

	public User() {
	}

	public User(Integer id, String username, String password, String nickname, String gender, Integer age, String address) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", nickname='" + nickname + '\'' +
				", gender='" + gender + '\'' +
				", age=" + age +
				", address='" + address + '\'' +
				'}';
	}
}
