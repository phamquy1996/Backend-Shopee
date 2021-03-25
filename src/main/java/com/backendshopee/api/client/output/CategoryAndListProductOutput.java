package com.backendshopee.api.client.output;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.dto.AddressDTO;
import com.backendshopee.dto.Products;
import com.backendshopee.dto.SubcategoryDTO;

public class CategoryAndListProductOutput {
	private Long id;
	private String name;
	
	private String image;
	
	private Long totalPage; 
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	List<Products> products = new ArrayList<>();
	List<SubcategoryDTO> subCategories = new ArrayList<>();
	List<AddressDTO> addresss = new ArrayList<>();

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public List<SubcategoryDTO> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubcategoryDTO> subcategories) {
		this.subCategories = subcategories;
	}

	public Long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public List<AddressDTO> getAddresss() {
		return addresss;
	}

	public void setAddresss(List<AddressDTO> addresss) {
		this.addresss = addresss;
	}
}
