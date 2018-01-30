package com.example.demo.dao;

import com.example.demo.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yys on 2018/1/29.
 */
public interface FilmDao extends JpaRepository<Film,Long> {
}
