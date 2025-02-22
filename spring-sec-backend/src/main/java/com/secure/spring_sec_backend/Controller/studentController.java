package com.secure.spring_sec_backend.Controller;

import com.secure.spring_sec_backend.Models.Student;
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
