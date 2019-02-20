package com.hmc.test.springboot2.service.serviceimpl;

import com.hmc.test.springboot2.dao.Userdao;
import com.hmc.test.springboot2.service.UserService;
import com.hmc.test.springboot2.vo.Useres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private Userdao userdao;
    @Override
    public List<Useres> showall() {
        return userdao.showall();
    }
}
