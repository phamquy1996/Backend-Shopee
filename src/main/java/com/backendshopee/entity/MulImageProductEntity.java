package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MulImageProduct")
public class MulImageProductEntity extends ParentEntity{
	@Column(name = "image")
	private String image;
	
	@Column(name = "product_id")
	private Number product_id;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Number getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Number product_id) {
		this.product_id = product_id;
	}
}
