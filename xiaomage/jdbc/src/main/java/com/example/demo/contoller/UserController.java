package com.example.demo.contoller;

import com.example.demo.demo.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/mvc/save.do")
    public boolean  saveMvc(User user){
        System.out.println(Thread.currentThread().getName()+"------------"+user.toString());
        Map map=null;
        return userRepository.save(user);
    }
}
