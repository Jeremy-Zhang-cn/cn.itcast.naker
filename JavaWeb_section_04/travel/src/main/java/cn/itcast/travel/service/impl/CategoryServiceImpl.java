package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CategoryServiceImpl implements CategoryService {

	private CategoryDao dao = new CategoryDaoImpl();

	private List<Category> cs;

	@Override
	public List<Category> findAll() {

		//从redis中查询
		Jedis jedis = JedisUtil.getJedis();
		//使用sortedSet排序查询
	//	Set<String> categories = jedis.zrange("category", 0, -1);
		//查询sortedSet中的分数（cid）和值（cname）
		Set<Tuple> categories = jedis.zrangeWithScores("category", 0, -1);
		//判断查询的集合是否为空
		if (categories == null || categories.size() == 0) {

			System.out.println("从数据库中查询");

			//如果为空，需要从数据库查询，再将数据存入redis
			cs = dao.findAll();
			//将集合数据存储到redis中
			for (Category c : cs) {

				jedis.zadd("category", c.getCid(), c.getCname());

			}

		} else {
			//如果不为空，将set的数据存入list
			cs = new ArrayList<Category>();

			System.out.println("从redis中查询");

			for (Tuple tuple : categories) {
				Category category = new Category();
				category.setCname(tuple.getElement());
				category.setCid((int)tuple.getScore());
				cs.add(category);
			}
		}

		//如果不为空，直接返回


		return cs;

	}
}
