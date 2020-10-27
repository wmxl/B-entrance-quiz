package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.db.DataProvider;
import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @CrossOrigin()
    @PostMapping(value = "/add")
    public void addStudent(@RequestBody Student stu) {
        System.out.println(stu.getName());
        int id = DataProvider.students.size();
        DataProvider.students.add(new Student(id, stu.getName()));
    }
}
