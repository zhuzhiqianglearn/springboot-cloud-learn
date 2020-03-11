package com.example.demo.hander;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {
    public Mono<ServerResponse> hello(ServerRequest request) {
        Mono<String> mono=Mono.just("zzq");
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
//                .body(BodyInserters.fromValue("Hello, Spring!"));
                .body(mono,String.class);
    }
}
