package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAll(){
        Student[] stu = new Student[5];
        stu[0] = new Student(1, "成吉思汗");
        stu[1] = new Student(2, "鲁班七号");
        stu[2] = new Student(3, "太乙真人");
        stu[3] = new Student(4, "钟无艳");
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            students.add(stu[i]);
        }
        return students;
    }
}
