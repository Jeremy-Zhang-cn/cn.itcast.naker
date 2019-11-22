package com.itheima.day_07.demo_10;

import java.util.*;

public class UpdatedPokerDemo {

	/*
		模拟斗地主的发牌过程，升级版，用户手牌已被排序。
		牌的花色有：♥heart ♦diamond ♣clubs ♠spade
	 */
	public static void main(String[] args) {

		String[] colors = {"♥", "♦", "♣", "♠"};
		String[] points = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		String[] jokers = {"小王", "大王"};

		HashMap<Integer, String> cards = new HashMap<>();	//用于存储每一张牌对应的索引和牌面信息
		ArrayList<Integer> cardsIndex = new ArrayList<>();	//用于单独存储每一张牌对应的索引，便于后期根据索引进行排序

		//将牌和其对应的索引分别存储到HashMap和ArrayList中
		int index = 0;
		for (String point : points) {
			for (String color : colors) {	//将花色和点数组合起来
				cards.put(index, color + point);	//存储牌对应索引和牌面信息
				cardsIndex.add(index);	//存储牌对应的索引
				index ++;
			}
		}

		//存入两张王牌及其对应索引
		cards.put(index, jokers[0]);
		cardsIndex.add(index);
		index++;
		cards.put(index, jokers[1]);
		cardsIndex.add(index);

		Collections.shuffle(cardsIndex);	//洗牌（打乱牌的索引来达到洗牌的效果）

		//定义四个TreeSet集合分别存储三名玩家和底牌的索引
		//由于使用的是TreeSet集合，存入其中的索引信息会被自动排序
		TreeSet<Integer> a = new TreeSet<>();	//玩家a
		TreeSet<Integer> b = new TreeSet<>();	//玩家b
		TreeSet<Integer> c = new TreeSet<>();	//玩家c
		TreeSet<Integer> holeCards = new TreeSet<>();    //底牌

		//发牌
		for (int i = 0; i < cards.size(); i++) {
			if (i < cards.size() - 3) {    //最后3张留作底牌
				if (i % 3 == 0) {
					a.add(cardsIndex.get(i));
				} else if (i % 3 == 1) {
					b.add(cardsIndex.get(i));
				} else {
					c.add(cardsIndex.get(i));
				}
			} else {
				holeCards.add(cardsIndex.get(i));
			}
		}

		checkCards(cards, a, "张三");
		checkCards(cards, b, "李四");
		checkCards(cards, c, "王五");
		checkCards(cards, holeCards, "底牌");

	}


	//查看每位玩家的手牌信息
	private static void checkCards(HashMap<Integer, String> cards, TreeSet<Integer> ts, String name) {

		System.out.print(name + "的牌为： ");
		for (Integer integer : ts) {
			System.out.print(cards.get(integer) + " ");
		}
		System.out.println();
	}

}
