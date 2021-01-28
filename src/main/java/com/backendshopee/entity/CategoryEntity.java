package com.backendshopee.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryEntity")
	  private Set<SubCategoryEntity> listEmployee = new HashSet<>();

}
