package com.backendshopee.entity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name = "Category")
public class CategoryEntity extends ParentEntity {
	
//	@NotNull
//    @Size(min = 4, max = 40, message = "Age should not be less than 18")
	@Column(name = "name")
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
	
	@OneToMany(mappedBy = "categoryentity", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<SubCategoryEntity> SubCategories;
	
	@OneToMany(mappedBy = "categoryentity", cascade = CascadeType.ALL)
	private List<ChildCategoryEntity> ChildCategories = new ArrayList<>();
	
	@OneToMany(mappedBy = "categoryentity", cascade = CascadeType.ALL)
	private List<ProductEntity> Products = new ArrayList<>();

	public List<SubCategoryEntity> getSubCategories() {
		return SubCategories;
	}

	public void setSubCategories(List<SubCategoryEntity> subCategories) {
		SubCategories = subCategories;
	}

	public List<ChildCategoryEntity> getChildCategories() {
		return ChildCategories;
	}

	public void setChildCategories(List<ChildCategoryEntity> childCategories) {
		ChildCategories = childCategories;
	}

	public List<ProductEntity> getProducts() {
		return Products;
	}

	public void setProducts(List<ProductEntity> products) {
		Products = products;
	}
	
    
//	@JsonManagedReference
//	public List<ChildCategoryEntity> getChildCategoryEntity() {
//		return ChildCategoryEntity;
//	}
//
//	public void setChildCategoryEntity(List<ChildCategoryEntity> childCategoryEntity) {
//		ChildCategoryEntity = childCategoryEntity;
//	}
//	@JsonManagedReference
//	public List<ProductEntity> getProductEntity() {
//		return ProductEntity;
//	}
//
//	public void setProductEntity(List<ProductEntity> productEntity) {
//		ProductEntity = productEntity;
//	}



}
