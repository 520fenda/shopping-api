package com.study.service.impl;

import com.study.dao.UserDao;
import com.study.entity.User;
import com.study.entity.UserVo;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public UserVo getLoginUser(String account,String password) {
        return userDao.getLoginUser(account,password);
    }

    @Override
    public User getUserByAccount(String account) {
        return userDao.getUserByAccount(account);
    }



    @Override
    public User checkAccountPassword(String account, String password) {
        return userDao.checkAccountPassword(account, password);
    }

//    @Override
//    public UserVo getLoginUsertt(String account, String password) {
//        return userDao.getLoginUsertt(account, password);
//    }
}
