package com.backendshopee.dto;

public class SearchProductDTO {
	private int filterRating; 
	private int newItem; 
	private Integer minPrice; 
	private int page = 0; 
	private String province;
	private String sort;
	public int getFilterRating() {
		return filterRating;
	}
	public void setFilterRating(int filterRating) {
		this.filterRating = filterRating;
	}
	public int getNewItem() {
		return newItem;
	}
	public void setNewItem(int newItem) {
		this.newItem = newItem;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if(page < 0) {
			this.page = 0;
		}else {
			this.page = page;
		}
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public Integer getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}
	
}
