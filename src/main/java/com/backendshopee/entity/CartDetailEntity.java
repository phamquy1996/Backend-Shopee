package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CartDetail")
public class CartDetailEntity extends ParentEntity {
	
	@Column(name = "qty")
	private Number qty;
	
	@Column(name = "checkBuy")
	private Number checkBuy = 0;
	
	@Column(name = "product_id")
	private String product_id;
	
	@Column(name = "user_id_buyer")
	private String user_id_buyer;
	
	@Column(name = "user_id_saler")
	private String user_id_saler;

	public Number getQty() {
		return qty;
	}

	public void setQty(Number qty) {
		this.qty = qty;
	}

	public Number getCheckBuy() {
		return checkBuy;
	}

	public void setCheckBuy(Number checkBuy) {
		this.checkBuy = checkBuy;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

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
