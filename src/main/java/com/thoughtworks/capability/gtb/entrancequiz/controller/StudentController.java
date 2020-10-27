package com.thoughtworks.capability.gtb.entrancequiz.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping(value = "/student")
    @CrossOrigin("http://localhost/1234")
    public String SayHello(){
        return "Hello";
    }
}
