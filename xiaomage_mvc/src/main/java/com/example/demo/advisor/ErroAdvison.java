package com.example.demo.advisor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ErroAdvison {

      @ExceptionHandler(Exception.class)
    public Object pageNoFound(HttpServletRequest request, Throwable throwable){
          System.out.println(111111111);
          return  request;
      }
}
