package com.backendshopee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	@OneToMany(mappedBy = "subCategoryEntity")
	private List<ProductEntity> ProductEntity = new ArrayList<>();
	
	@OneToMany(mappedBy = "subCategoryEntity")
	private List<ChildCategoryEntity> childCategoryEntity = new ArrayList<>();
	
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
	
	@JsonBackReference
	public CategoryEntity getCategoryentity() {
		return categoryentity;
	}

	public void setCategoryentity(CategoryEntity categoryentity) {
		this.categoryentity = categoryentity;
	}

	public void setChildCategoryEntity(List<ChildCategoryEntity> childCategoryEntity) {
		this.childCategoryEntity = childCategoryEntity;
	}

	public List<ProductEntity> getProductEntity() {
		return ProductEntity;
	}

	public void setProductEntity(List<ProductEntity> productEntity) {
		ProductEntity = productEntity;
	}
	
}
