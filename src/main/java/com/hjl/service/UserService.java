package com.hjl.service;

import com.hjl.domain.User;

import java.util.List;

public interface UserService {
    public void save(User user);
    public List<User> findAll();
}
