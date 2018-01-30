package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yys on 2018/1/30.
 */
public interface UserDao extends JpaRepository<User,Integer> {

    public User findUserById(Integer id);
    public List<User> findUserByIdAndName(Integer id,String name);
    public List<User> findUserByAgeBetween(int min,int max);
}
