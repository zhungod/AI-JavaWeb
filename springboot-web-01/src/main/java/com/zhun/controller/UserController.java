package com.zhun.controller;

import com.zhun.pojo.User;
import com.zhun.service.UserService;
import com.zhun.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService = new UserServiceImpl();
    @RequestMapping("/list")
    public List<User> list(){

        List<User> userList = userService.findall();

        return userList;
    }
}
