package com.secure.spring_sec_backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Login")
public class Login {

    @GetMapping("/Greet")
    public String Greet(){
        return "Hey, there";
    }

}
