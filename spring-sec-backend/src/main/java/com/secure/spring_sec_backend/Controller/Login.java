package com.secure.spring_sec_backend.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Login {

    @GetMapping("/LoginDemo")
    public String login(){
        return "login succesful";
    }

    @GetMapping("/Greet")
    public String Greet(HttpServletRequest request){
        String test;
        test = "hey there I am Spring security project and your session ID: " + request.getSession().getId();
        return test;
    }

    @GetMapping("/About")
    public String about(){
        return "about Page";
    }

}
