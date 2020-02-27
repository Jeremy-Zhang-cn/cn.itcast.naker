package com.itheima.mapper;

import com.itheima.domain.Department;
import com.itheima.domain.Patient;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface PatientMapper {

	@Insert("INSERT INTO `patient` VALUES (#{id}, #{name}, #{gender}, #{did}, #{advice})")
	void save(Patient patient);	//录入患者信息

	@Select("SELECT * FROM `patient`")
	@Results({
			@Result(id = true, column = "id", property = "id"),
			@Result(column = "name", property = "name"),
			@Result(column = "gender", property = "gender"),
			@Result(column = "advice", property = "advice"),
			@Result(
					property = "department",
					column = "did",
					javaType = Department.class,
					one = @One(select = "com.itheima.mapper.DeptMapper.getById")
			)
	})
	List<Patient> listAll();	//展示所有用户信息

	@Select("<script>" +
			"	SELECT p.id, p.name p_name, p.gender, p.did FROM `patient` p" +
			"	<where>" +
			"		<if test='name != null'>" +
			"			AND p_name LIKE #{name}" +
			"		</if>" +
			"		<if test='true'>" +
			"			ORDER BY p.id" +
			"		</if>" +
		"		</where>" +
			"</script>")
	@Results({
			@Result(id = true, column = "id", property = "id"),
			@Result(column = "p_name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "gender", property = "gender"),
			@Result(column = "did", property = "did"),
			@Result(
					property = "department", column = "did",javaType = Department.class,
					one = @One(select = "com.itheima.mapper.DeptMapper.getById")
			)

	})
	List<Patient> listLikeName(String name); //根据姓名做模糊查询

}
