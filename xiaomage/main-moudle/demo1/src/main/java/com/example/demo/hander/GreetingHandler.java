package com.example.demo.hander;

import com.example.User;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {
    public Mono<ServerResponse> hello(ServerRequest request) {
        User user=new User(1,"zzq");
        System.out.println(user.toString());
        Mono<String> mono=Mono.just("zzq");
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
//                .body(BodyInserters.fromValue("Hello, Spring!"));
                .body(mono,String.class);
    }
}
