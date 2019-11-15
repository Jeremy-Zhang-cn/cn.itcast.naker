package com.itheima.day_02.myInterface;

public class JumpingImpl_Cat extends Animals implements Jumping {

	public JumpingImpl_Cat() {
	}

	public JumpingImpl_Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void jumping() {
		System.out.println("Cat is Jumping");
	}

	@Override
	public void eat() {
		System.out.println("Eating fish...");
	}
}
