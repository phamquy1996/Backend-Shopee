package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FollowUser")
public class FollowUserEntity extends ParentEntity {
	@Column(name = "user_id")
	private String user_id;
	
	@Column(name = "product_id")
	private Number product_id;
	
	@Column(name = "user_id_follow")
	private Number user_id_follow;

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

	public Number getUser_id_follow() {
		return user_id_follow;
	}

	public void setUser_id_follow(Number user_id_follow) {
		this.user_id_follow = user_id_follow;
	}
}
