package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "MulImageProduct")
public class MulImageProductEntity extends ParentEntity{
	
	@Column(name = "image")
	private String image;

	@ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
	private ProductEntity productEntity;
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	@JsonIgnore
	public ProductEntity getProductEntity() {
		return productEntity;
	}
	
	@JsonIgnore
	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

}
