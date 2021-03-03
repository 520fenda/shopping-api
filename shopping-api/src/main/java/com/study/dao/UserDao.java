package com.study.dao;

import com.study.entity.User;
import com.study.entity.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> getUsers();
    User getUserById(Integer id);
    UserVo getLoginUser(@Param("account") String account, @Param("password") String password);
   User getUserByAccount(String account);

    User checkAccountPassword(@Param("account") String account, @Param("password") String password);




}
