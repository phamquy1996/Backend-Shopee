package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "BillDetail")
public class BillDetailEntiy extends ParentEntity {
	@Column(name = "name", nullable = true, unique = true)
	private String name;
	
	@Column(name  = "content", nullable = true, unique = true)
	private String content;
	
	@Column(name = "price")
	private Number price;
	
	@Column(name = "qty")
	private Number qty;
	
	@Column(name = "image")
	private String image = "0";
	
	@Column(name = "bill_id")
	private Number bill_id;
	
	@Column(name = "product_id")
	private Number product_id;
	
	@Column(name = "user_id_buyer")
	private Number user_id_buyer;
	
	@Column(name = "user_id_saler")
	private Number user_id_saler;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Number getPrice() {
		return price;
	}

	public void setPrice(Number price) {
		this.price = price;
	}

	public Number getQty() {
		return qty;
	}

	public void setQty(Number qty) {
		this.qty = qty;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Number getBill_id() {
		return bill_id;
	}

	public void setBill_id(Number bill_id) {
		this.bill_id = bill_id;
	}

	public Number getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Number product_id) {
		this.product_id = product_id;
	}

	public Number getUser_id_buyer() {
		return user_id_buyer;
	}

	public void setUser_id_buyer(Number user_id_buyer) {
		this.user_id_buyer = user_id_buyer;
	}

	public Number getUser_id_saler() {
		return user_id_saler;
	}

	public void setUser_id_saler(Number user_id_saler) {
		this.user_id_saler = user_id_saler;
	}
	
}
