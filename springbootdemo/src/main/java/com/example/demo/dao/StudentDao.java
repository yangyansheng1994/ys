package com.example.demo.dao;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yys on 2018/1/29.
 */
public interface StudentDao extends JpaRepository<Student,Integer> {
}
