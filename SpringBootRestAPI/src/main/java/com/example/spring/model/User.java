package com.example.spring.model;

import java.util.List;

public class User {
private int id;
private String name;
private String address;

private List<Contact> contact;


public List<Contact> getContact() {
	return contact;
}
public void setContact(List<Contact> contact) {
	this.contact = contact;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public User(int id, String name, String address) {
	this.id = id;
	this.name = name;
	this.address = address;
}


@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
}
public User(int id, String name, String address, List<Contact> contact) {
	this.id = id;
	this.name = name;
	this.address = address;
	this.contact = contact;
}
public User() {
}


}
