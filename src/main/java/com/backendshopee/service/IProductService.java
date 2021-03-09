package com.backendshopee.service;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.entity.ProductEntity;

public interface IProductService {
	public void addProduct(ProductDTO productDTO);
	public ProductEntity findById(Long id);
}
