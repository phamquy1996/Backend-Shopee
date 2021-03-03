package com.backendshopee.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Category")
public class CategoryEntity extends ParentEntity {
	
	
	@Column(name = "name")
	@NotNull
    @Size(min = 4, max = 15, message = "Age should not be less than 18")
	private String name;
	
	@Column(name = "image")
	private String image;

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
	
	@OneToMany(mappedBy = "categoryentity")
	private List<SubCategoryEntity> SubCategories;
	
	@OneToMany(mappedBy = "categoryentity")
	private List<ChildCategoryEntity> ChildCategoryEntity = new ArrayList<>();
	
	@OneToMany(mappedBy = "categoryentity")
	private List<ProductEntity> ProductEntity = new ArrayList<>();
	
	@JsonManagedReference
	public List<SubCategoryEntity> getSubCategories() {
		return SubCategories;
	}
	
	public void setSubCategories(List<SubCategoryEntity> subCategories) {
		SubCategories = subCategories;
	}
	
	@JsonManagedReference
	public List<ChildCategoryEntity> getChildCategoryEntity() {
		return ChildCategoryEntity;
	}

	public void setChildCategoryEntity(List<ChildCategoryEntity> childCategoryEntity) {
		ChildCategoryEntity = childCategoryEntity;
	}
	@JsonManagedReference
	public List<ProductEntity> getProductEntity() {
		return ProductEntity;
	}

	public void setProductEntity(List<ProductEntity> productEntity) {
		ProductEntity = productEntity;
	}



}
