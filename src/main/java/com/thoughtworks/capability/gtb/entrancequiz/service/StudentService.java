package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.db.DataProvider;
import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAll(){
        return DataProvider.students;
    }
}
