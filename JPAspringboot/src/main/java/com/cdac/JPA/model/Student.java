package com.cdac.JPA.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id	
private int id;
private String name;
private String address;
private double marks;
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
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
}
public Student(int id, String name, String address, double marks) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.marks = marks;
}
public Student() {
	super();}}