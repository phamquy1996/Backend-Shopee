package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SubCategory")
public class SubCategoryEntity extends ParentEntity{
	@Column(name = "name")
	private String name;
	
	@Column(name = "image")
	private String image = "0";
	
	@Column(name = "category_id")
	private Number category_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Number getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Number category_id) {
		this.category_id = category_id;
	}
}
