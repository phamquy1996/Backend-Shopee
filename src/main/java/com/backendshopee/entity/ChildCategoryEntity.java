package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ChildCategory")
public class ChildCategoryEntity extends ParentEntity {
	@Column(name = "name")
	private String name;
	
	@Column(name = "image")
	private String image = "0";
	
	@Column(name = "subcategory_id")
	private Number subcategory_id;

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

	public Number getSubcategory_id() {
		return subcategory_id;
	}

	public void setSubcategory_id(Number subcategory_id) {
		this.subcategory_id = subcategory_id;
	}
}
