package com.itheima.service.impl;

import com.itheima.domain.Item;
import com.itheima.mapper.ItemMapper;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;

	@Override
	public Item getById(Integer id) {

		return itemMapper.getById(id);

	}

}
