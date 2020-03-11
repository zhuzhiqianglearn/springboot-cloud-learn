package com.example.demo.repository;

import com.example.demo.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserRepository {

    private final DataSource dataSource;

    @Autowired
    public UserRepository(DataSource dataSource){
        this.dataSource=dataSource;
    }

    public boolean save(User user){
        System.out.println(Thread.currentThread().getName()+"------------"+user.toString());
          return true;
    };
}
