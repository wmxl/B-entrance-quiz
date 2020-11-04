package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.db.DataProvider;
import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

//TODO GTB-完成度: * 只有查询学员和增加学员的功能
//TODO GTB-知识点: * Spring Boot 依赖注入及 MVC 方面的 annotations 还不太熟

@RestController
public class StudentController {

    //TODO GTB-知识点: - StudentController.java:14 推荐使用构造函数注入
    @Autowired
    private StudentService studentService;

    @CrossOrigin()
    @GetMapping(value = "/students")
    public List<Student> findAll(){
        //TODO GTB-工程实践: - StudentController.java:20 直接写成 return studentService.findAll(); 就行
        List<Student> list = studentService.findAll();
        return list;
    }
    @CrossOrigin()
    @PostMapping(value = "/add")
    public void addStudent(@RequestBody Student stu) {
        //TODO GTB-工程实践: - StudentController.java:28 不要留 print 语句！
        System.out.println(stu.getName());
        int id = DataProvider.students.size();
        //TODO GTB-工程实践: - StudentController.java:31 决定 id 不是 controller 的职责
        //TODO GTB-工程实践: - id 也不能由 size 来决定，日后有了删除功能，id 会重复的
        DataProvider.students.add(new Student(id+1, stu.getName()));
    }
}
