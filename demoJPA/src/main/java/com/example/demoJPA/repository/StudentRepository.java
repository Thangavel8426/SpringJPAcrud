package com.example.demoJPA.repository;

import com.example.demoJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findBytechnology(String technology);
    @Query(nativeQuery = true,
    value="select*FROM student WHERE age= :age AND technology= :technology")
    List<Student> findByAgeAndTechnology(@Param("age") int age,
                                            @Param("technology")String technology);




}
