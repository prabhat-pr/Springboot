package com.example.spring.model;

public class Contact {
	private Long cid;
	private String email;
	private String phoneno;
	
	private int id;

	public Contact(Long cid, String email, String phoneno, int i) {
		this.cid = cid;
		this.email = email;
		this.phoneno = phoneno;
		this.id = i;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", email=" + email + ", phoneno=" + phoneno + ", id=" + id + "]";
	}
	

}
