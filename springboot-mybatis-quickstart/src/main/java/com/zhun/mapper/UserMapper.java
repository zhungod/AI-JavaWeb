package com.zhun.mapper;

import com.zhun.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
     */
    List<User> findAll();

    /**
     * 根据ID查询用户
     */
    User findById(Integer id);

    /**
     * 新增用户
     */
    void insert(User user);

    /**
     * 修改用户
     */
    void update(User user);

    /**
     * 根据ID删除用户
     */
    void deleteById(Integer id);
}
