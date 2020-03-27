package com.itheima.springboot_rabbitmq_consumer.config;

public class User {

	private String name;
	private Integer age;

	private User(UserBuilder userBuilder) {
		this.name = userBuilder.name;
		this.age = userBuilder.age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public static class UserBuilder {

		private String name;
		private Integer age;

		public UserBuilder() {

		}

		public UserBuilder name(String name) {
			this.name = name;
			return this;
		}

		public UserBuilder age(Integer age) {
			this.age = age;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}


}
