package com.example.userService.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Long id;
	private String name;
	private String phone;
	
	List<Contact> contact = new ArrayList<>();

	public User(Long id, String name, String phone, List<Contact> contact) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.contact = contact;
	}

	public User(Long id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	
	public User(){
		
	}



}
