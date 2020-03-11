package com.example.demo.hander;

import com.example.demo.demo.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class UserHander {
    @Autowired
    public UserRepository userRepository;

    public Mono<ServerResponse> saveUser(ServerRequest serverRequest) {
        System.out.println(Thread.currentThread().getName()+"------------flux");

        Mono<User> userMono = serverRequest.bodyToMono(User.class);
        Mono<Boolean> booleanMono = userMono.map(userRepository::save);
         return  ServerResponse.ok().body(booleanMono,Boolean.class);
    }
}
