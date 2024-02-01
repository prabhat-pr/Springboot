package com.example.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.spring.model.Contact;
import com.example.spring.model.User;
import com.example.spring.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/data")
	public String getdata()
	{
		return "this is the data for rest api using rest controller";
	}
	
	@GetMapping("/")
	public List<User> get()
	{
		return userService.gatall();
	}
	
	@GetMapping("/{id}")
	public User get(@PathVariable("id")int id)
	{
		User u=userService.getuser(id);
		List<Contact> list=restTemplate.getForObject("http://localhost:9001/contact/"+id, List.class);
		u.setContact(list);
		return u;
	}
	
	@PostMapping("/")
	public User add(@RequestBody User u)
	{
		System.out.println("controller called");
		return userService.save(u);
	}
}
