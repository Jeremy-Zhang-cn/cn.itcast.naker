package com.itheima.mapper;

import com.itheima.domain.Department;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DeptMapper {

	@Select("SELECT * FROM `dept`")
	List<Department> listAll();

	@Select("SELECT * FROM `dept` WHERE id=#{id}")
	Department getById(Integer id);

}
