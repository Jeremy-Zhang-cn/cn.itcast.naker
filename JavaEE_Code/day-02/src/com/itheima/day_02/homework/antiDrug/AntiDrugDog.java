package com.itheima.day_02.homework.antiDrug;

public class AntiDrugDog extends Animal implements AntiDrug {

	@Override
	void bark() {
		System.out.println("woof");
	}

	@Override
	void eat() {
		System.out.println("啃骨头");
	}

	@Override
	public void antiDrug() {
		System.out.println("用鼻子侦测毒品");
	}
}
