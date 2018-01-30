package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yys on 2018/1/30.
 */
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("/findUser")
    public List<User> findUsers( ){
        List<User> list= userDao.findUserByIdAndName(2,"李四");
        return list;
    }
    @RequestMapping("/findByAge")
    public List<User> findUserByAge(){
        List<User> list=userDao.findUserByAgeBetween(15,26);
        return list;
    }
}
