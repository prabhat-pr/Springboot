package com.example.spring.service;

import java.util.List;

import com.example.spring.model.User;

public interface UserService {

	public User getuser(int id);
	public List<User> gatall();
	public User save(User u);
}
