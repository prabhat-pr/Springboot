package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Student;
import com.example.spring.service.StudentService;

//@Controller
//@RequestMapping("app")
//public class DataController {
//	@ResponseBody
//	@RequestMapping("/data")
//	public String getdata() {
//		return "This is the reposne for REST API";
//	}

@RestController
@RequestMapping("stu")
public class DataController {
	@Autowired
	StudentService studentService;
	@RequestMapping("/data")
	public String getData() {
		return "This is the reposne for REST API";
	}
	
	@GetMapping("/")
	public List<Student> getAll(){
		return studentService.getAll();
	}
	@GetMapping("/{id}")
	public Student get(@PathVariable("id")int id){
		return studentService.get(id);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id")int id) {
		studentService.delete(id);
		return "Deleted Successfully";
	}
	//insert
	@PostMapping("/")
	public Student save(@RequestBody Student s) {
		
		return studentService.save(s);
	}
	@PutMapping("/")
	public Student update(@RequestBody Student s) {
		
		return studentService.update(s);
	}
	
	
	
	
	
	
	
	
}