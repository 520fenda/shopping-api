package com.study.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.study.entity.User;
import com.study.entity.UserVo;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/LoginUser")
    @ResponseBody
    public Object LoginUser(@RequestBody UserVo userVo) throws JsonProcessingException  {
            HashMap<String,Object> hs=new HashMap<>();
        if (userService.checkAccountPassword(userVo.getAccount(), userVo.getPassword())!=null){

            hs.put("code",200 );
            hs.put("account",userVo.getAccount() );
        }else {
            hs.put("code",400 );
            hs.put("msg","账号或密码错误" );
        }

        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(hs);
    }
    @ResponseBody
    @GetMapping("/getUserById")
    public User getUserById(Integer id) {
        return userService.getUserById(id);
    }

    @ResponseBody
    @GetMapping("/getUserByAccount")
    public User getUserByAccount(String account) {
        return userService.getUserByAccount(account);
    }

//    @ResponseBody
//    @GetMapping("/checkAccountPassword")
//    public User checkAccountPassword(String account,String password) {
//        return userService.checkAccountPassword(account,password );
//    }

}
