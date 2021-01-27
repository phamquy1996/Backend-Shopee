package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class ProductEntity extends ParentEntity{
	@Column(name = "name", nullable = true, unique = true)
	private String name;
	
	@Column(name  = "description", nullable = true, unique = true)
	private String description;
	
	@Column(name = "price")
	private Float price;
	
	@Column(name = "discount")
	private Float discount;
	
	@Column(name = "view")
	private Number view = 0;
	
	@Column(name = "qty")
	private Number qty = 0;
	
	@Column(name = "content_discount", length = 512)
	private String content_discount;
	
	@Column(name = "subCate_id")
	private Number subCate_id;
	
	@Column(name = "user_id")
	private Number user_id = 0;
	
	@Column(name = "unit_id")
	private Number unit_id;
	
	@Column(name = "image")
	private String image = "0";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Number getView() {
		return view;
	}

	public void setView(Number view) {
		this.view = view;
	}

	public Number getQty() {
		return qty;
	}

	public void setQty(Number qty) {
		this.qty = qty;
	}

	public String getContent_discount() {
		return content_discount;
	}

	public void setContent_discount(String content_discount) {
		this.content_discount = content_discount;
	}

	public Number getSubCate_id() {
		return subCate_id;
	}

	public void setSubCate_id(Number subCate_id) {
		this.subCate_id = subCate_id;
	}

	public Number getUser_id() {
		return user_id;
	}

	public void setUser_id(Number user_id) {
		this.user_id = user_id;
	}

	public Number getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(Number unit_id) {
		this.unit_id = unit_id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
