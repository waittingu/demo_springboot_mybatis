package com.bbbb.demo.dao;

import com.bbbb.demo.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface UserDao {

    /**
     * 用户数据新增
     */
    @Insert("insert into t_user(id,name,age) values (#{id},#{name},#{age})")
    void addUser(User user);


    /**
     * 用户数据修改
     */
    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);


    /**
     * 用户数据删除
     */
    @Delete("delete from t_user where id=#{id}")
    void deleteUser(int id);

    /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("SELECT id,name,age FROM t_user where name=#{userName}")
    User findByName(@Param("userName") String userName);

    /**
     * 查询所有
     */
    @Select("SELECT id,name,age FROM t_user")
    List<User> findAll();
}
