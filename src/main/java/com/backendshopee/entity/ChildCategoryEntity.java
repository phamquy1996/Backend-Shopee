package com.backendshopee.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "ChildCategory")
public class ChildCategoryEntity extends ParentEntity {
	@Column(name = "name")
	private String name;
	
	@Column(name = "image")
	private String image = "0";
	
	
	@ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
	private CategoryEntity categoryentity;
	
	@ManyToOne
    @JoinColumn(name = "subcategory_id", nullable = false)
	private SubCategoryEntity subCategoryEntity;
	
	@OneToMany(mappedBy = "childCategoryEntity") 
	private List<ProductEntity> ProductEntity = new ArrayList<>();
	
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
	 @JsonIgnore
	public CategoryEntity getCategoryentity() {
		return categoryentity;
	}
	 @JsonIgnore
	public void setCategoryentity(CategoryEntity categoryentity) {
		this.categoryentity = categoryentity;
	}
	 @JsonIgnore
	public SubCategoryEntity getSubCategoryEntity() {
		return subCategoryEntity;
	}
	 @JsonIgnore
	public void setSubCategoryEntity(SubCategoryEntity subCategoryEntity) {
		this.subCategoryEntity = subCategoryEntity;
	}
	
	public Long getCate_id(){
        return categoryentity.getId();
    }

    //getter Method to get the author's full name
    public String getNameCate(){
        return categoryentity.getName();
    }
    
    public Long getSubcate_id(){
        return subCategoryEntity.getId();
    }

    //getter Method to get the author's full name
    public String getSubcate_name(){
        return subCategoryEntity.getName();
    }
//	@JsonManagedReference
//	public List<ProductEntity> getProductEntity() {
//		return ProductEntity;
//	}
//
//	public void setProductEntity(List<ProductEntity> productEntity) {
//		ProductEntity = productEntity;
//	}

}
