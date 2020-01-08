package com.itheima.day21_jedis.demo.dao.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.day21_jedis.demo.dao.ProvinceDao;
import com.itheima.day21_jedis.demo.domain.Province;
import com.itheima.day21_jedis.demo.jedis.util.JedisPoolUtils;
import com.itheima.day21_jedis.demo.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceDaoImpl implements ProvinceDao {

	private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());

	@Override
	public List<Province> findAll() {

		String sql = "select * from province";
		List<Province> list = template.query(sql, new BeanPropertyRowMapper<>(Province.class));
		return list;

	}

	@Override
	public String findAllJson() {

		//先从redis中查询数据
		Jedis jedis = JedisPoolUtils.getJedis();	//获取redis客户端连接
		String province_json = jedis.get("province");
		//判断json数据是否为null
		if (province_json == null || province_json.length() == 0) {
			//redis中没有数据
			System.out.println("redis中没有数据，查询数据库");
			//从数据库中查询
			List<Province> ps = findAll();
			//将list序列化为json
			ObjectMapper mapper = new ObjectMapper();
			try {
				province_json = mapper.writeValueAsString(ps);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}

			//将json数据存入redis
			jedis.set("province", province_json);
			jedis.close();    //归还连接

		} else {
			System.out.println("redis中有数据，查询缓存");
		}
		return province_json;

	}

}
