package com.secure.spring_sec_backend.Controller;

import com.secure.spring_sec_backend.Models.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentController {

    List<Student> getStudents = new ArrayList<>(List.of(
            new Student(1, "Rajnish"), new Student(2, "bharath")
    ));

//    Getting CSRF Token: because the third party or some other API not know the csrf-token, we get that using this 
//    method and adding them in the Headers only the post method works
    @GetMapping("/csrf-token")
    public CsrfToken getCSRFToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute(CsrfToken.class.getName());
    }

    @PostMapping("/addStudent")
    public String addStudnet(@RequestBody Student student){
        getStudents.add(student);
        return "stduent added succesfully";
    }

    @GetMapping("/getStudents")
    public List<Student> students(){
        return getStudents;
    }
}
