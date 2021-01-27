package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FavoriteProduct")
public class FavoriteProductEntity extends ParentEntity {
	@Column(name = "user_id")
	private String user_id;
	
	@Column(name = "product_id")
	private Number product_id;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Number getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Number product_id) {
		this.product_id = product_id;
	}
}
