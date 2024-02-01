package com.example.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
