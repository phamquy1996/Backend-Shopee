package com.backendshopee.service;

import java.util.List;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.entity.ProductEntity;

public interface IProductService {
	public void addProduct(ProductDTO productDTO);
	public ProductEntity findById(Long id);
	public List<ProductEntity> all(); 
}
