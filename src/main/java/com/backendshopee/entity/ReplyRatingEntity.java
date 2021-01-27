package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ReplyRating")
public class ReplyRatingEntity extends ParentEntity {
	@Column(name  = "content", nullable = true, unique = true)
	private String content;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "user_id")
	private Number user_id;
	
	@Column(name = "rating_id")
	private Number rating_id;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Number getUser_id() {
		return user_id;
	}

	public void setUser_id(Number user_id) {
		this.user_id = user_id;
	}

	public Number getRating_id() {
		return rating_id;
	}

	public void setRating_id(Number rating_id) {
		this.rating_id = rating_id;
	}
}
