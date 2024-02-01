package com.example.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.dao.StudentRepo;
import com.example.spring.model.Student;

@Service
public class StudentServiceImple implements StudentService{
	@Autowired
	StudentRepo studentRepo;
	@Override
	public Student save(Student s) {
		return studentRepo.save(s);
	}
	@Override
	public Student get(int id) {
		Optional<Student> obj=studentRepo.findById(id);
		return obj.get();
	}
	@Override
	public List<Student> getAll() {
		return studentRepo.findAll();
	}
	@Override
	public void delete(int id) {
		studentRepo.deleteById(id);
	}
	@Override
	public Student update(Student s) {
		return studentRepo.save(s);
	}	
}