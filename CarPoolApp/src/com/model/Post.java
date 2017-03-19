package com.model;

import java.time.LocalDate;
import java.util.List;

public class Post {
	private int postId;
	private String postText;
	private String postType;
	private LocalDate dateCreated;
	private LocalDate dateUpdated;

	private User user;// who posted it
	private List<Like> like; // can have many likes
	private List<Comment> comment; // can have many comments

	public Post() {
	}

	public Post(int postId, String postText, String postType, LocalDate dateCreated, LocalDate dateUpdated, User user,
			List<Like> like, List<Comment> comment) {
		this.postId = postId;
		this.postText = postText;
		this.postType = postType;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.user = user;
		this.like = like;
		this.comment = comment;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDate getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(LocalDate dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Like> getLike() {
		return like;
	}

	public void setLike(List<Like> like) {
		this.like = like;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postText=" + postText + ", postType=" + postType + ", dateCreated="
				+ dateCreated + ", dateUpdated=" + dateUpdated + ", user=" + user + ", like=" + like + ", comment="
				+ comment + "]";
	}

}
