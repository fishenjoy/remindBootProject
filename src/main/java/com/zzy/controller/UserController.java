package com.zzy.controller;

import com.zzy.mapper.UserMapper;
import com.zzy.pojo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers(){
        List<UserEntity> users=userMapper.getAll();
        return  users;
    }
}
