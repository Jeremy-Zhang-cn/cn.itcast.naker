package com.itheima.userservice.mapper;

import com.itheima.userservice.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper{

	@Select("select * from `user` where id = #{id}")
	User selectById(Long id);

}
