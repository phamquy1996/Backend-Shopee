package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ImagesRating")
public class ImagesRatingEntity extends ParentEntity{
	@Column(name = "image")
	private String image;
	
	@Column(name = "rating_id")
	private Number rating_id;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Number getRating_id() {
		return rating_id;
	}

	public void setRating_id(Number rating_id) {
		this.rating_id = rating_id;
	}
}
