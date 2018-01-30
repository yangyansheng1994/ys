package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yys on 2018/1/29.
 */
@RestController
public class StudentController {
    @Autowired
    private StudentDao studentDao;
    //插入操作
    @RequestMapping("/insert")
    public void addStudent(){
        Student student=new Student();
        student.setId(10);
        student.setUsername("毛爷爷");
        student.setPassword("jiushiyouqian");
        studentDao.save(student);
        System.out.println("添加成功！");
    }
    //查询操作
    @RequestMapping("/find/{id}")
    public Student getStudent(@PathVariable("id")Integer id){
       return studentDao.findOne(id);
    }
    //修改操作
    @RequestMapping("/update{id}")
    public  void update(){
        Student student=new Student();
        student.setId(1);
        student.setUsername("小红");
        student.setPassword("2222");
        studentDao.save(student);
        System.out.println("更新成功！");
    }
    //删除操作
    @RequestMapping("/delete")
    public void delete(){
        studentDao.delete(1);
        System.out.println("删除成功！");
    }
}
