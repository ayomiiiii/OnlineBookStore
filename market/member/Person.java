package com.market.member;

public class Person {
	private String name;
	private String phone;
	private String address;
	
	public Person(String name, String phone) {
		this.name=name;
		this.phone=phone;
		this.address="���ѹα�";
	}
	public Person(String name, String phone,String address) {
		this.name=name;
		this.phone=phone;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String Phone) {
		this.phone=phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
}
