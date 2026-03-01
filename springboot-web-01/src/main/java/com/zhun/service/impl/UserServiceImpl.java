package com.zhun.service.impl;

import com.zhun.pojo.User;
import com.zhun.dao.UserDao;
import com.zhun.dao.impl.UserDaoImpl;
import com.zhun.service.UserService;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    /**
     * 获取所有用户信息
     * @return 封装为User对象
     */
    @Override
    public List<User> findall() {

        //1.调用dao层，获取数据
        List<String> lines = userDao.findall();

        //2.转换为User对象
        List<User> userList = lines.stream().map(line -> {
            String[] parts = line.split(",");
            Integer id = Integer.parseInt(parts[0]);
            String username = parts[1];
            String password = parts[2];
            String name = parts[3];
            Integer age = Integer.parseInt(parts[4]);
            LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id, username, password, name, age, updateTime);
        }).collect(Collectors.toList());

        return userList;
    }
}
