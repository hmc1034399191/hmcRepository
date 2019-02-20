package com.hmc.test.springboot2.controller;

import com.hmc.test.springboot2.service.serviceimpl.UserServiceimpl;
import com.hmc.test.springboot2.vo.Useres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages="com.hmc.test.springboot2.service")//添加的注解
public class UserController {
    @Autowired
    private UserServiceimpl userServiceimpl;
    @RequestMapping("showall")
    public List<Useres> showUserall(){
        List<Useres> user=userServiceimpl.showall();
        System.out.println(user);
        return user;
    }
}
