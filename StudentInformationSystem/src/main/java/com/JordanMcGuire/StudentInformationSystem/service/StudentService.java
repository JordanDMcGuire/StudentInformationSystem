package com.JordanMcGuire.StudentInformationSystem.service;

import com.JordanMcGuire.StudentInformationSystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent (Student student);
    public List<Student> getAllStudents();

}
