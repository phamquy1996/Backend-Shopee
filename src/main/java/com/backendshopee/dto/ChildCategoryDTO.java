package com.backendshopee.dto;

public class ChildCategoryDTO{

	private String name;
	
	private String image = "0";
	
	private Long category_id;
	
	private Long subcategory_id;
	
	private Integer status;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getSubcategory_id() {
		return subcategory_id;
	}

	public void setSubcategory_id(Long subcategory_id) {
		this.subcategory_id = subcategory_id;
	}
	
}
