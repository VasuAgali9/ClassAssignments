package com.itc.main.entity;

import java.time.LocalDateTime;

public class UserProfile {

	private String userId;
	private String firstName;
	private String lastName;
	private String contact;
	private LocalDateTime createAt;
//	private List<News> newsList;
	
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserProfile(String userId, String firstName, String lastName, String contact, LocalDateTime createAt) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.createAt = createAt;
//		this.newsList = newsList;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public LocalDateTime getCreateAt() {
		return createAt;
	}
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	
}
