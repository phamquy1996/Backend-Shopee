package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "Nofication")
public class NoficationEntity extends ParentEntity{
	@Column(name = "name")
	private String name;
	
	@Column(name  = "content", nullable = true, unique = true)
	private String content;
	
	@Column(name = "type_nofication")
	private Number type_nofication;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "user_id")
	private Number user_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Number getType_nofication() {
		return type_nofication;
	}

	public void setType_nofication(Number type_nofication) {
		this.type_nofication = type_nofication;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Number getUser_id() {
		return user_id;
	}

	public void setUser_id(Number user_id) {
		this.user_id = user_id;
	}
}
