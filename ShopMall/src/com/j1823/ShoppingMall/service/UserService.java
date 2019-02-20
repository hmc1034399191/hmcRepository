package com.j1823.ShoppingMall.service;

import com.j1823.ShoppingMall.entity.UseresBeans;

public interface UserService {
    //插入一个用户信息
    int inserUser(UseresBeans user);
    //查询一个用户信息
    UseresBeans seleUser(String u_usernum);
}
