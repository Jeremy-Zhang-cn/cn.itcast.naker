package com.itheima.day_02.sports;

public class PingpongAthletes extends Athletes implements StudyEnglish {

	public PingpongAthletes() {
	}

	public PingpongAthletes(String name, int age) {
		super(name, age);
	}

	@Override
	public void study() {
		System.out.println("学习乒乓球技巧。。。");
	}

	@Override
	public void eat() {
		System.out.println("乒乓球运动员正在吃饭。。。");
	}

	@Override
	public void studyEnglish() {
		System.out.println("乒乓球运动员正在学英语。。。");
	}
}
