package com.hjl.mapper;

import com.hjl.domain.User;

import java.util.List;

public interface UserMapper {
    public void save(User user);
    public List<User> findAll();
}
