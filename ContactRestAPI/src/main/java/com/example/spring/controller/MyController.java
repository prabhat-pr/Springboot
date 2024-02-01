package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Contact;
import com.example.spring.service.ContactService;

@RestController
@RequestMapping("/contact")
public class MyController {
	@Autowired
	ContactService contactService;
	
	@GetMapping("/{id}")
	public List<Contact> get(@PathVariable("id") int id)
	{
	return contactService.getContact(id);
	}
	}
