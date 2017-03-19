package com.model;

import java.time.LocalDate;
import java.util.List;

import com.dataaccess.DataAcess;

public class User {
	private int userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate birthDate;
	private String email;

	private Address address;
	private List<Post> post;
	private List<Comment> comment;
	private Account account;
	private Like like;

	public User() {

	}

	public User(int userId, String userName, String password, String firstName, String lastName, String gender,
			LocalDate birthDate, String email, Address address, List<Post> post, List<Comment> comment, Account account,
			Like like) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.email = email;
		this.address = address;
		this.post = post;
		this.comment = comment;
		this.account = account;
		this.like = like;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Like getLike() {
		return like;
	}

	public void setLike(Like like) {
		this.like = like;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", gender=" + gender + ", birthDate=" + birthDate + ", email="
				+ email + ", address=" + address + ", post=" + post + ", comment=" + comment + ", account=" + account
				+ ", like=" + like + "]";
	}

	public boolean login(String username, String password) {
		DataAcess dataaccess = new DataAcess();
		return dataaccess.login(username, password);
	}
}
