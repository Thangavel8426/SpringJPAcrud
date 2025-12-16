package com.example.demoJPA.controller;

import com.example.demoJPA.model.Student;
import com.example.demoJPA.service.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Data

@RestController
public class Studentcontroller {
    @Autowired
    StudentService s;
    @GetMapping("Students")
    public List<Student> getAllStudent(){
        return s.StudentService();

    }
    @PostMapping("Students")
    public Student addStudent(@RequestBody Student stu){
        return s.addStudent(stu);

    }
    @GetMapping("Students/{rollno}")
    public Student getbyrollno(@PathVariable int rollno)
    {

        return s.getstudentbyroll(rollno);


    }
    @PutMapping("Students")
    public Student studentupdate(@RequestBody Student stu){
         return s.studentupdate(stu);

    }

     @DeleteMapping("Students/{rollno}")
    public String deleteStudent(@PathVariable int rollno){
         return s.deleteStudent(rollno);
    }
}
