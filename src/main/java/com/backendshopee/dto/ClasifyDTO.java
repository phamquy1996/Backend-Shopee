package com.backendshopee.dto;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.entity.SubClassifyEntity;

public class ClasifyDTO {
	private List<SubClassifyEntity> subClassifies = new ArrayList<>();
	
	private String name;
	private Number qty = 0;
	private Number price = 0;

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
	
}
