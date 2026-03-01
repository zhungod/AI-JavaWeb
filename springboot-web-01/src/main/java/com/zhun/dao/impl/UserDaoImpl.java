package com.zhun.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.zhun.dao.UserDao;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    /**
     * 获取所有用户信息
     * @return 返回读取用户数据
     */
    @Override
    public List<String> findall() {
        //加载txt文件，获取用户数据
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
        return lines;
    }
}
