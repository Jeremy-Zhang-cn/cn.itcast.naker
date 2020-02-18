package com.itheima.mapper;

import com.itheima.domain.Order;

import java.util.List;

public interface OrderMapper {

	List<Order> listAll();

	List<Order> listByUid(Long uid);

}
