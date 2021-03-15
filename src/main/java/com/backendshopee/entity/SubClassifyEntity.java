package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "SubClassify")
public class SubClassifyEntity extends ParentEntity {
	@Column(name = "name")
	private String name;
	
	@Column(name = "qty")
	private int qty;
	
	@Column(name = "price")
	private int price;
	
	@ManyToOne
    @JoinColumn(name = "classify_id", nullable = false)
	private ClassifyEntity classifyEntity;
	
	@ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
	private ProductEntity productEntity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@JsonIgnore
	public ClassifyEntity getClassifyEntity() {
		return classifyEntity;
	}
	
	@JsonIgnore
	public void setClassifyEntity(ClassifyEntity classifyEntity) {
		this.classifyEntity = classifyEntity;
	}
	
	@JsonIgnore
	public ProductEntity getProductEntity() {
		return productEntity;
	}
	
	@JsonIgnore
	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
