package com.itheima.day_02.sports;

public class SportsDemo {

	public static void main(String[] args) {

		PingpongAthletes pa = new PingpongAthletes("张继科",18);
		PingpongCoach pc = new PingpongCoach("刘国梁", 40);


		BasketballAthletes ba = new BasketballAthletes("蔡徐坤", 23);
		BasketballCoach bc = new BasketballCoach("卫立杰", 37);

		pa.show();
		pc.show();
		System.out.println("---------");

		pa.eat();
		pa.study();
		pa.studyEnglish();
		System.out.println("---------");
		pc.eat();
		pc.teach();
		pc.studyEnglish();


		ba.show();
		bc.show();
		System.out.println("---------");

		ba.eat();
		ba.study();
		System.out.println("---------");
		bc.eat();
		bc.teach();
	}
}
