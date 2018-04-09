package com.github.springboot.freemaker.jdbctemplate.controller;

import com.github.springboot.freemaker.jdbctemplate.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by verse on 2018/4/9.
 */
@RestController
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/save")
    public String save(){
        userService.createUser("verse02",27);
        return "success";
    }
}
