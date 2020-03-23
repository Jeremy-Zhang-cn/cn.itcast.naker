package com.itheima.plugins_test.dao;

import com.itheima.plugins_test.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserXmlMapper {

	@Select("select * from `user`")
	List<User> findAll();

}
