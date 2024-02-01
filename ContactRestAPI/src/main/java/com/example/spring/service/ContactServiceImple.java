package com.example.spring.service;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.spring.model.Contact;
@Service
public class ContactServiceImple implements ContactService{

	List<Contact> clist=List.of(
			new Contact(1L,"raj@gmail.com","76437683765",13),
			new Contact(2L,"viraj@gmail.com","76437683765",13),
			new Contact(3L,"niraj@gmail.com","76437683765",14),
			new Contact(4L,"rajender@gmail.com","76437683765",14),
			new Contact(5L,"siraj@gmail.com","76437683765",15),
			new Contact(8L,"deeraj@gmail.com","76437683765",16)
		);

	@Override
	public List<Contact> getContact(int userid) {
		// TODO Auto-generated method stub
		return clist.stream().filter(contact->contact.getId()==(userid)).collect(Collectors.toList());
	}
	
	
			
}
