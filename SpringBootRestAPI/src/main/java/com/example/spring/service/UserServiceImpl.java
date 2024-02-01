package com.example.spring.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.model.User;
@Service
public class UserServiceImpl implements UserService{

	List<User> list=List.of(new User(12,"nehal","delhi"),
			new User(13,"neha","jaipur"),
			new User(14,"sneha","gzb"),
			new User(15,"mrinal","lucknow"),
			new User(16,"amar","pune"));

	@Override
	public User getuser(int id) {
		/*
		 * Iterator<User> itr=list.iterator(); User u=null; while(itr.hasNext()) {
		 * u=itr.next(); if(u.getId()==id) return u; } return u;
		 */
		return list.stream()
				  .filter(user -> id==(user.getId()))
				  .findAny()
				  .orElse(null);
	}

	@Override
	public List<User> gatall() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public User save(User u) {
		// TODO Auto-generated method stub
		System.out.println("service called");
		list.add(u);
		System.out.println("service completed");
		return u;
	}
	
	

}
