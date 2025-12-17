package com.example.demoJPA.controller;

import com.example.demoJPA.model.Student;
import com.example.demoJPA.service.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.data.repository.query.Param;
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
    @DeleteMapping("Students/deleteall")
    public String deleteall(Student stu){
        s.deleteall(stu);
        return "DB is cleared";
    }
    @GetMapping("Students/technology/{tech}")
    public List<Student> getStudentByTechnology(@PathVariable("tech") String str){
        return s.getStudentByTechnology(str);
    }
    @PostMapping("Students/fliter")
    public List<Student>getStudentByageandTechnology(@Param("age") int age,
                                                     @Param("technology") String technology){
        return s.getStudentByAgeAndtecnlogy(age,technology);
    }

}
