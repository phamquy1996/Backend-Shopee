package com.backendshopee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Classify")
public class ClassifyEntity extends ParentEntity {
	@Column(name = "name")
	private String name;
	
	@Column(name = "qty")
	private Number qty = 0;
	
	@ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
	private ProductEntity productEntity;
	
	@OneToMany(mappedBy = "classifyEntity")
	private List<SubClassifyEntity> subClassifyEntity = new ArrayList<>();

	public String getName() {
		return name;
	}
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "image")
	private String image;

	public void setName(String name) {
		this.name = name;
	}

	public Number getQty() {
		return qty;
	}

	public void setQty(Number qty) {
		this.qty = qty;
	}
	
	@JsonIgnore
	public ProductEntity getProductEntity() {
		return productEntity;
	}
	
	@JsonIgnore
	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}
	
	public List<SubClassifyEntity> getSubClassifyEntity() {
		return subClassifyEntity;
	}
	
	public void setSubClassifyEntity(List<SubClassifyEntity> subClassifyEntity) {
		this.subClassifyEntity = subClassifyEntity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}