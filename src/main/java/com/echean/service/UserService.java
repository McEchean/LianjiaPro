package com.echean.service;

import com.echean.dao.UserMapper;
import com.echean.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public int AddOneUser(User user) {
        return userMapper.insert(user);
    }

    public List<User> SelectUser() {
        return userMapper.selectByExample(null);
    }
}
