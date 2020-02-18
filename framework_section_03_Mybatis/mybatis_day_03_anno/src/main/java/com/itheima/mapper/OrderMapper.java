package com.itheima.mapper;

import com.itheima.domain.Order;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {

	@Select("select * from `sys_order`")
	@Results(
			value = {
					@Result(property = "id", column = "id", id = true),
					@Result(property = "orderTime",column = "orderTime"),
					@Result(property = "total", column = "total"),
					@Result(property = "uid", column = "uid"),
					@Result(property = "user", column = "uid", javaType = User.class,
						one = @One(select = "com.itheima.mapper.UserMapper.getById"))
			}
	)
	List<Order> listAll();


	@Select("select * from `sys_order` where uid=#{uid}")
	List<Order> listByUid(Long uid);


}
