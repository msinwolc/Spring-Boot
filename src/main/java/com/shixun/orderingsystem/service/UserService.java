package com.shixun.orderingsystem.service;

import com.shixun.orderingsystem.bean.Administrator;
import com.shixun.orderingsystem.bean.Food;
import com.shixun.orderingsystem.bean.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public interface UserService {
    String Register(User user);
    User queryUser(User user);
    Administrator queryUser(Administrator administrator);
}
