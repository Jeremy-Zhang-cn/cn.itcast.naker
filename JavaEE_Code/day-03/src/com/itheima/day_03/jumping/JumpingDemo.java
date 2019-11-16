package com.itheima.day_03.jumping;

public class JumpingDemo {

	public static void main(String[] args) {

		useJumping(new JumpImpl());	//匿名对象
		System.out.println("--------");
		useJumping(getJumping());
	}

	public static void useJumping(Jumping jumping) {
		//相当于多态形式 Jumping jumping = new JumpImpl()的简写
		jumping.jump();

	}

	public static Jumping getJumping() {
		return new JumpImpl();
	}
}
