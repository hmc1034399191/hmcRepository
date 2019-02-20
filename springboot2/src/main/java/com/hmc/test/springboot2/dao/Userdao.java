package com.hmc.test.springboot2.dao;

import com.hmc.test.springboot2.vo.Useres;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Userdao {
    //查询所有用户信息
    List<Useres> showall();
}
