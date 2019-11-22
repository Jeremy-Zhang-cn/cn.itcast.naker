package com.itheima.day_07.demo_09;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {

	/*
		模拟斗地主发牌，版本1.0，不对用户拿到的牌进行排序
	 */
	//花色有：♥heart ♦diamond ♣clubs ♠spade
	public static void main(String[] args) {

		ArrayList<String> cards = createCards();
		distributeCards(cards);


	}

	private static ArrayList<String> createCards() {

		String[] color = {"♥", "♦", "♣", "♠"};
		String[] points = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		String[] jokers = {"大王", "小王"};

		ArrayList<String> cards = new ArrayList<>();

		for (String s : color) {
			for (String point : points) {
				cards.add(s + point);
			}

		}
		cards.add(jokers[0]);
		cards.add(jokers[1]);

		Collections.shuffle(cards);    //洗牌
		return cards;

	}

	private static void distributeCards(ArrayList<String> cards) {	//发牌

		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		ArrayList<String> c = new ArrayList<>();
		ArrayList<String> holeCards = new ArrayList<>();	//底牌

		for (int i = 0; i < cards.size(); i++) {
			if (i < cards.size() - 3) {	//最后3张留作底牌
				if (i % 3 == 0) {
					a.add(cards.get(i));
				} else if (i % 3 == 1) {
					b.add(cards.get(i));
				} else {
					c.add(cards.get(i));
				}
			} else {
				holeCards.add(cards.get(i));
			}
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(holeCards);

	}

}
