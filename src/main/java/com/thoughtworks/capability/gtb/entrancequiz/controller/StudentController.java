package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @CrossOrigin()
    @GetMapping(value = "/students")
    public List<Student> findAll(){
        List<Student> list = studentService.findAll();
        return list;
    }
}
