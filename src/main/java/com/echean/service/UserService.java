package com.echean.service;

import com.echean.dao.UserMapper;
import com.echean.pojo.User;
import com.echean.pojo.UserExample;
import com.echean.pojo.UserExample.Criteria;
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

    public User selectUserByUsernameAndPwd(String username, String password) throws Exception {
        User user = new User(username, password);
        return userMapper.selectByNameAndPwd(user);
    }

    public int insertUser(User user) {
        return userMapper.insertSelective(user);
    }

    public Boolean checkUsername(String username) {
        UserExample userExample = new UserExample();
        Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        Long count = userMapper.countByExample(userExample);
        return count == 0;
    }

    public Boolean checkEmail(String email) {
        UserExample userExample = new UserExample();
        Criteria criteria = userExample.createCriteria();
        criteria.andEmailEqualTo(email);
        Long count = userMapper.countByExample(userExample);
        return count == 0;
    }

    public Boolean checkPhone(String phone) {
        UserExample userExample = new UserExample();
        Criteria criteria = userExample.createCriteria();
        criteria.andTelephoneEqualTo(phone);
        Long count = userMapper.countByExample(userExample);
        return count == 0;
    }
}
