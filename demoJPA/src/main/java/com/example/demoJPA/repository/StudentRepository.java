package com.example.demoJPA.repository;

import com.example.demoJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
