package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StudentController {
    @GetMapping(value = "/student")
    @CrossOrigin("http://localhost/1234")
    public List<Student> findAll(){
        List<Student> list = new ArrayList<>();
        return list;
    }
}
