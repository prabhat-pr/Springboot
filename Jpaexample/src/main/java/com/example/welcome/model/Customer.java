package com.example.welcome.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	private int custid;
	private String name;
	private String address;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
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
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", address=" + address + "]";
	}
	public Customer(int custid, String name, String address) {
		this.custid = custid;
		this.name = name;
		this.address = address;
	}
	public Customer() {
	}
	
	
}
