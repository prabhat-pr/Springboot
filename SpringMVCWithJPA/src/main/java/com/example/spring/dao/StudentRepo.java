package com.example.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
