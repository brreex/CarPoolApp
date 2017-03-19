package com.model;

public class Account {
	private String userName;
	private String password;
	
	private User user;
	
	public Account(){
		
	}

	public Account(String userName, String password, User user) {
		this.userName = userName;
		this.password = password;
		this.user = user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", password=" + password + ", user=" + user + "]";
	}
	
}
