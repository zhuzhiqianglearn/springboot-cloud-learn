package com.example.demo.webflux;

import com.example.demo.demo.User;
import com.example.demo.hander.UserHander;
import com.example.demo.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class MyWebflux {

    @Bean
    public RouterFunction<ServerResponse> saveUser(UserHander userHander){
        return  route(POST("/web/save.do"),userHander::saveUser);
//        return  null;
    }
}
