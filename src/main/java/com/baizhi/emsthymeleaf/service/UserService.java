package com.baizhi.emsthymeleaf.service;

import com.baizhi.emsthymeleaf.entity.User;

public interface UserService {


    //用户注册
    void save(User user);

    //用户登录
    User login(User user);
}
