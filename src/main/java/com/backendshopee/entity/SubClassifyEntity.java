package com.backendshopee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SubClassify")
public class SubClassifyEntity extends ParentEntity {
	@Column(name = "name")
	private String name;
	
	@Column(name = "qty")
	private Number qty;
	
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

	public Number getQty() {
		return qty;
	}

	public void setQty(Number qty) {
		this.qty = qty;
	}

	public ClassifyEntity getClassifyEntity() {
		return classifyEntity;
	}

	public void setClassifyEntity(ClassifyEntity classifyEntity) {
		this.classifyEntity = classifyEntity;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}
}
