package com.example.spring.model;

public class Contact {
	private Long cid;
	private String email;
	private String phoneno;
	
	private int userid;

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Contact(Long cid, String email, String phoneno, int userid) {
		this.cid = cid;
		this.email = email;
		this.phoneno = phoneno;
		this.userid = userid;
	}

	

	

}
