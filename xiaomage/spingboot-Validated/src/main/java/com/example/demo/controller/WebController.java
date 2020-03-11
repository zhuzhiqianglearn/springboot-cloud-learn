package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("saveUser.do")

    public User save(@Validated User user) {
        return user;
    }


    @RequestMapping("saveUserSpring.do")

    public User saveUserSpring(User user) {

        Assert.notNull(user.getName(),"名称不能为空");
        assert user.getId()<100;
        return user;
    }
}
