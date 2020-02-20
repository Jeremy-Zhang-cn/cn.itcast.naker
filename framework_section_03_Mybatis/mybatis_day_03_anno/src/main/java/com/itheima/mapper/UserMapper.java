package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

	@Select("select * from `sys_user`")
	@Results({
			@Result(property = "id", column = "id", id = true),
			@Result(property = "username", column = "username"),
			@Result(property = "password", column = "password"),
			@Result(property = "orderList", column = "id", javaType = List.class,
			many = @Many(select = "com.itheima.mapper.OrderMapper.listByUid"))
	})
	List<User> listAll();

	@Select("select * from `sys_user` where id=#{id}")
	User getById(Long id);


	@Select("<script>" +
			"select * from `sys_user`" +
			"	<where>" +
			"		<if test='id != null and id != 0'>" +
			"			and id=#{id}" +
			"		</if>" +
			"		<if test='username!=null'>" +
			"			and username=#{username}" +
			"		</if>" +
			"		<if test='password != null'>" +
			"			and password=#{password}" +
			"		</if>" +
			"	</where>" +
			"</script>")
	List<User> listByCondition(User user);


	@Select("SELECT * FROM `sys_user`")
	@Results({
			@Result(id = true, column = "id", property = "id"),
			@Result(column = "username", property = "username"),
			@Result(column = "password", property = "password"),
			@Result(
					property = "roles",
					column = "id",
					javaType = List.class,
					many = @Many(select = "com.itheima.mapper.RoleMapper.listByUid")
			)
	})
	List<User> listUserAndRoleAll();

}
