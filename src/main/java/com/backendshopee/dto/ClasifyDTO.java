package com.backendshopee.dto;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.entity.SubClassifyEntity;

public class ClasifyDTO {
	private List<SubClassifyEntity> subClassifies = new ArrayList<>();
	
	private String name;
	private Integer qty = 0;
	private Integer price = 0;
	private Long product_id;
	private String image;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
