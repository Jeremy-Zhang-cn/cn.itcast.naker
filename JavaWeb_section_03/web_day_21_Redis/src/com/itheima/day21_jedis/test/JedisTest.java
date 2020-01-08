package com.itheima.day21_jedis.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisTest {

	@Test
	public void Test01() {

		Jedis jedis = new Jedis("localhost", 6379); //如果使用无参构造则默认使用localhost和6379端口

		//	jedis.set("username","zhangsan");
		jedis.setex("activeCode", 10, "wangwu");    //设置过期时间为10秒的key和value

		//存储hash
		jedis.hset("user", "name", "lisi");
		jedis.hset("user", "age", "23");
		jedis.hset("user", "gender", "male");

		//获取hash
		String name = jedis.hget("user", "name");
		System.out.println(name);

		//获取hash中所有的map中的数据
		Map<String, String> user = jedis.hgetAll("user");

		Set<String> keySet = user.keySet();

		for (String key : keySet) {
			//获取value
			String value = user.get(key);
			System.out.println(key + ":" + value);
		}

		jedis.close();    //关闭连接，释放资源
	}

	@Test
	public void Test02() {
		//list操作
		Jedis jedis = new Jedis();

		//list存储
		jedis.lpush("myList", "a", "b", "c");  //从左边存
		jedis.rpush("myList", "a", "b", "c");  //从右边存

		//范围获取
		List<String> myList = jedis.lrange("myList", 0, -1);
		System.out.println(myList);

		//list弹出
		String element = jedis.lpop("myList");
		System.out.println(element);    //c

		String element1 = jedis.rpop("myList");
		System.out.println(element1);    //c

		List<String> myList1 = jedis.lrange("myList", 0, -1);
		System.out.println(myList1);

		jedis.close(); //关闭连接

	}

	@Test
	public void Test03() {
		//set数据结构操作
		Jedis jedis = new Jedis();

		//set存储
		jedis.sadd("mySet", "Java", "C", "PHP");
		//set获取
		Set<String> mySet = jedis.smembers("mySet");
		System.out.println(mySet);

		jedis.close();
	}

	@Test
	public void Test04() {
		//sortedSet数据结构操作
		Jedis jedis = new Jedis();

		//sortedSet存储
		jedis.zadd("mySortedSet",50,"Java");
		jedis.zadd("mySortedSet",35,"C");
		jedis.zadd("mySortedSet",25,"PHP");

		//sortedSet获取
		Set<String> mySortedSet = jedis.zrange("mySortedSet", 0, -1);
		System.out.println(mySortedSet);

		jedis.close();
	}

}
