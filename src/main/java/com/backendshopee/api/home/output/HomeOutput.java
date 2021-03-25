package com.backendshopee.api.home.output;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.dto.CategoryDTO;
import com.backendshopee.dto.Products;

public class HomeOutput {
	List<Products> products = new ArrayList<>();
	List<CategoryDTO> categories = new ArrayList<>();
	
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public List<CategoryDTO> getCategories() {
		return categories;
	}
	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}
	

}
