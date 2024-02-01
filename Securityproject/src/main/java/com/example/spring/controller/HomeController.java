package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/admin")
	public String getdata()
	{
		return "This is secure data for admin";
	}

	@GetMapping("/user")
	public String userdata()
	{
		return "This is secure data for user";
	}
	
	
}
