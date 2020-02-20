package com.itheima.mapper;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountMapper {

	//存入信息
	@Insert("INSERT INTO `Account` VALUES (#{id}, #{name}, #{money})")
	void save(Account account);

	//查询所有信息
	@Select("SELECT * FROM `Account`")
	List<Account> listAll();


}
