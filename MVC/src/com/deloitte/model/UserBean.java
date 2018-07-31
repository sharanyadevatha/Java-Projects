package com.deloitte.model;

import java.io.Serializable;

public class UserBean implements Serializable {
	
	private String firstName;
	private String lastName;
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
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	public boolean authenticate(String userName, String password) {
		if (userName != null && password != null) {
			if (userName.equalsIgnoreCase("Sharanya") && password.equalsIgnoreCase("hello")) {
				firstName = "Sharanya";
				lastName = "Devatha";
				
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
