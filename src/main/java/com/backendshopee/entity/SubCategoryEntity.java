package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "SubCategory")
public class SubCategoryEntity extends ParentEntity{
	@Column(name = "name")
	private String name;
	
	@Column(name = "image")
	private String image = "0";
	
	@ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
	private CategoryEntity categoryentity;

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

	public CategoryEntity getCategoryentity() {
		return categoryentity;
	}

	public void setCategoryentity(CategoryEntity categoryentity) {
		this.categoryentity = categoryentity;
	}


}
