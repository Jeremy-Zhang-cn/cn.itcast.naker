package com.itheima.day_02.sports;

public class PingpongCoach extends Coach implements StudyEnglish {

	public PingpongCoach() {
	}

	public PingpongCoach(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("教授乒乓球技巧。。。");
	}

	@Override
	public void eat() {
		System.out.println("乒乓球教练正在吃饭。。。");
	}

	@Override
	public void studyEnglish() {
		System.out.println("乒乓球教练正在学英语。。。");
	}
}
