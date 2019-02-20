package com.hmc.test.springboot2.service;

import com.hmc.test.springboot2.vo.Useres;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public interface UserService {
    List<Useres> showall();
}
