package com.example.demo.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RestDemoContoller {

  @GetMapping("/aaaaaa")
    public String getaaa(){
      return "hello world";
  }

  @GetMapping("/aaa")
  public String aaa(){
    return "hello world aaa";
  }
  @GetMapping("/404.html")
  public Object aaaa(HttpServletRequest request, Throwable throwable, HttpStatus status){
    Map<String,Object> errors = new HashMap<>();

    errors.put("statusCode",
            request.getAttribute("javax.servlet.error.status_code"));
    errors.put("requestUri",
            request.getAttribute("javax.servlet.error.request_uri"));

    return errors;
  }

  @GetMapping("/npe")
  public Object npe(HttpServletRequest request, Throwable throwable, HttpStatus status){
     throw  new NullPointerException("故意抛出异常");
  }
}
