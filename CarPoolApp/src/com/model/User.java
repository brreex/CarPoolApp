package com.model;

import java.time.LocalDate;
import java.util.List;

import com.dataaccess.DataAcess;

public class User {
	private int userId;
	

	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate birthDate;
	private String email;
    private LocalDate dateUpdated;
    private LocalDate dateCreated;
	private Address address;
	private Account account;
	private List<Post> post;
	private List<Comment> comment;
	private Like like;

	public User() {

	}

	

	

	public User(int userId, String firstName, String lastName, String gender, LocalDate birthDate, String email,
			LocalDate dateUpdated, LocalDate dateCreated, Address address, Account account) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.email = email;
		this.dateUpdated = dateUpdated;
		this.dateCreated = dateCreated;
		this.address = address;
		this.account = account;
	}





	public int getUserId() {
		return userId;
	}





	public void setUserId(int userId) {
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





	public LocalDate getDateUpdated() {
		return dateUpdated;
	}





	public void setDateUpdated(LocalDate dateUpdated) {
		this.dateUpdated = dateUpdated;
	}





	public LocalDate getDateCreated() {
		return dateCreated;
	}





	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}





	public Address getAddress() {
		return address;
	}





	public void setAddress(Address address) {
		this.address = address;
	}





	public Account getAccount() {
		return account;
	}





	public void setAccount(Account account) {
		this.account = account;
	}





	public List<Post> getPost() {
		return post;
	}





	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}





	public Like getLike() {
		return like;
	}





	public void setLike(Like like) {
		this.like = like;
	}





	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", email=" + email + ", dateUpdated=" + dateUpdated + ", dateCreated="
				+ dateCreated + ", address=" + address + ", account=" + account + ", post=" + post + ", comment="
				+ comment + ", like=" + like + "]";
	}





	public boolean login(String username, String password) {
		DataAcess dataaccess = new DataAcess();
		return dataaccess.login(username, password);
	}
}
