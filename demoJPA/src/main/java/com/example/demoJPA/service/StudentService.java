package com.example.demoJPA.service;

import com.example.demoJPA.model.Student;
import com.example.demoJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentService {
    @Autowired
    StudentRepository sr;
    public List<Student> StudentService() {
        return sr.findAll();


    }


    public Student addStudent(Student stu) {
        return sr.save(stu);
    }
    public Student getstudentbyroll(int rollno){
        return sr.findById(rollno).orElse(new Student());
    }

    public Student studentupdate(Student stu) {


        return sr.save(stu);
    }

    public String deleteStudent(int rollno) {
          sr.deleteById(rollno);
          return "delted suceesfully";

    }


    public void deleteall(Student stu) {
        sr.deleteAll();
    }

    public List<Student> getStudentByTechnology(String str) {
         return sr.findBytechnology(str);
    }
    public List<Student> getStudentByAgeAndtecnlogy(int age,String tech){
         return sr.findByAgeAndTechnology(age,tech);
    }
}
