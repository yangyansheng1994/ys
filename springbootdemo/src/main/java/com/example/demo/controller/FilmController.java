package com.example.demo.controller;

import com.example.demo.dao.FilmDao;
import com.example.demo.domain.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yys on 2018/1/29.
 */
@RestController
public class FilmController {
    @Autowired
    private FilmDao filmDao;
    @RequestMapping("/findfilm/{id}")
    //查询一条
    public Film getFilm(@PathVariable("id") Long id){
        Film film=filmDao.findOne(id);
        return film;
    }
    //查询所有记录
    @RequestMapping("/findfilms")
    public List<Film> getFilms(){
        List<Film> list= filmDao.findAll();
        return list;
    }
    @RequestMapping("/deletefilm/{id}")
    public void addFilm(@PathVariable("id") long id){
        filmDao.delete(id);
    }

    @RequestMapping("/findAllByPage")
    public Page<Film> findAallByPage(){
        Sort sort=new Sort(Sort.Direction.ASC,"id");
        Pageable pageable=new PageRequest(2,6,sort);
        Page<Film> page=filmDao.findAll(pageable);
        return page;

    }



}
