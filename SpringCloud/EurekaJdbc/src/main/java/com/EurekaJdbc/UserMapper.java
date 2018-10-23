package com.EurekaJdbc;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM USER WHERE id = #{id}")
    User getUserById(@Param("id") Long id);
	
	@Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);
 
    @Insert("INSERT INTO USER(ID,NAME, AGE) VALUES(#{id},#{name}, #{age})")
    int insert(@Param("id") Integer id,@Param("name") String name, @Param("age") Integer age);

}
