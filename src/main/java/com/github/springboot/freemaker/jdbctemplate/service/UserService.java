package com.github.springboot.freemaker.jdbctemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by verse on 2018/4/9.
 */
@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createUser(String name, Integer age) {
        jdbcTemplate.update("INSERT INTO USER VALUE (null, ?, ?)", name, age);
    }
}
