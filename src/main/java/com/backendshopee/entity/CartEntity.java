package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class CartEntity extends ParentEntity {
	
	@Column(name = "user_id_buyer")
	private String user_id_buyer;
	
	@Column(name = "user_id_saler")
	private String user_id_saler;

	public String getUser_id_buyer() {
		return user_id_buyer;
	}

	public void setUser_id_buyer(String user_id_buyer) {
		this.user_id_buyer = user_id_buyer;
	}

	public String getUser_id_saler() {
		return user_id_saler;
	}

	public void setUser_id_saler(String user_id_saler) {
		this.user_id_saler = user_id_saler;
	}
	
}
