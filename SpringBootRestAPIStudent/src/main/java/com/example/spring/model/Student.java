package com.example.spring.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Student {
	@Id
	private int id;
	private String name;

	private double marks;
	private String address;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(int id, String name, double marks, String address) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	public Student() {
	}
}