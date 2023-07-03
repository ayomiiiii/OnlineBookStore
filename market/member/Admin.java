package com.market.member;

public class Admin extends Person {
	private String id="Admin";
	private String password="Admin1234";
	
	public Admin(String name, String phone) {
		super(name,phone);
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
}
