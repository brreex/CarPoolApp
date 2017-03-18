package com.model;

import java.time.LocalDate;

import com.dataaccess.DataAcess;

public class User {
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate birthDate;
	private String email;
	private Address address;
	
	public User(){
		
	}

	public User(String userName, String password, String firstName, String lastName, String gender, LocalDate birthDate,
			String email, Address address) {
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.email = email;
		this.address = address;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", birthDate=" + birthDate + ", email=" + email + ", address="
				+ address + "]";
	}

	public boolean login(String username,String password){
		DataAcess dataaccess = new DataAcess();
		return dataaccess.login(username, password);
	}
}
