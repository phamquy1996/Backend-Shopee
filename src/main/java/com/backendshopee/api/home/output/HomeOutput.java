package com.backendshopee.api.home.output;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.ProductEntity;

public class HomeOutput {
	List<ProductEntity> products = new ArrayList<>();
	List<CategoryEntity> categories = new ArrayList<>();
	public List<ProductEntity> getProducts() {
		return products;
	}
	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}
	public List<CategoryEntity> getCategories() {
		return categories;
	}
	public void setCategories(List<CategoryEntity> categories) {
		this.categories = categories;
	}
}
