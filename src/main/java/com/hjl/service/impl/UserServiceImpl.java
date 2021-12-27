package com.hjl.service.impl;

import com.hjl.domain.User;
import com.hjl.mapper.UserMapper;
import com.hjl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
