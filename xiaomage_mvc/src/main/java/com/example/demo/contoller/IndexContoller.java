package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexContoller {

    @RequestMapping("index.do")
    public String getIndex(HttpServletRequest request){
        request.setAttribute("name","zzq");
        return "index";
    }
    @RequestMapping("login.do")
    public String login(HttpServletRequest request){
        return "login";
    }
}
