package com.backendshopee.dto;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.entity.SubClassifyEntity;

public class ClasifyDTO {
	private List<SubClassifyEntity> subClassifies = new ArrayList<>();
	
	private String name;
	private Number qty = 0;
	private Number price = 0;
	private Long product_id;

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
	public Number getPrice() {
		return price;
	}
	public void setPrice(Number price) {
		this.price = price;
	}
	public List<SubClassifyEntity> getSubClassifies() {
		return subClassifies;
	}
	public void setSubClassifies(List<SubClassifyEntity> subClassifies) {
		this.subClassifies = subClassifies;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	
}
