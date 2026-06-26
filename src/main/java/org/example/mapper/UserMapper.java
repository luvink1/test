package org.example.mapper;

import org.apache.ibatis.annotations.*;
import org.example.pojo.user;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<user> findall();

    @Delete("delete from user where id=#{id}")
    public Integer delete(Integer id);
    @Insert("insert into user(username,password,name,age) values (#{username},#{password},#{name},#{age})")
    public void insert(user user);
    @Update("update user set username=#{username},password=#{password},name=#{name},age=#{age} where id=#{id}")
    public void update(user user);
    @Select("select *from user where username=#{username} and password=#{password}")
    public user findById(@Param("username")String username,@Param("password")String password);
}
