package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Rating")
public class RatingEntity extends ParentEntity{
	
	@Column(name  = "content", nullable = true, unique = true)
	private String content;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "start")
	private Number start;
	
	@Column(name = "user_id")
	private Number user_id;
	
	@Column(name = "product_id")
	private Number product_id;

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

	public Number getStart() {
		return start;
	}

	public void setStart(Number start) {
		this.start = start;
	}

	public Number getUser_id() {
		return user_id;
	}

	public void setUser_id(Number user_id) {
		this.user_id = user_id;
	}

	public Number getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Number product_id) {
		this.product_id = product_id;
	}
}
