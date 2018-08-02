package com.deloitte.model;

import java.io.Serializable;

import com.deloitte.dao.UserDao;

public class UserBean implements Serializable {

	private String firstName;
	private String lastName;
	UserDao user;

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
		UserDao user = new UserDao();
	}

	// String userName = username;
	

	public boolean authenticate(String username, String password) {
		boolean val = user.validate(username, password);
		return val;
	}
}
