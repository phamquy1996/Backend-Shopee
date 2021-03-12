package com.backendshopee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "SubCategory")

public class SubCategoryEntity extends ParentEntity{
	@Column(name = "name")
	private String name;
	
	@Column(name = "image")
	private String image = "0";
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", nullable = false)
	private CategoryEntity categoryentity;
	
	@OneToMany(mappedBy = "subCategoryEntity")	
	private List<ProductEntity> Products = new ArrayList<>();
	
	@OneToMany(mappedBy = "subCategoryEntity")
	private List<ChildCategoryEntity> childCategories= new ArrayList<>();
	
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
	
	public Long getAuthor_id(){
        return categoryentity.getId();
    }

    //getter Method to get the author's full name
    public String getAuthorName(){
        return categoryentity.getName();
    }
	
    @JsonIgnore
	public CategoryEntity getCategoryentity() {
		return categoryentity;
	}
    
    @JsonIgnore
	public void setCategoryentity(CategoryEntity categoryentity) {
		this.categoryentity = categoryentity;
	}
    @JsonIgnore
	public List<ChildCategoryEntity> getChildCategories() {
		return childCategories;
	}
	@JsonIgnore
	public void setChildCategories(List<ChildCategoryEntity> childCategories) {
		this.childCategories = childCategories;
	}

	public List<ProductEntity> getProducts() {
		return Products;
	}

	public void setProducts(List<ProductEntity> products) {
		Products = products;
	}

	
}
