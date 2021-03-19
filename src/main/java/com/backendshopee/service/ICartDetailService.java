package com.backendshopee.service;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.entity.CartEntity;
import com.backendshopee.entity.ProductEntity;

public interface ICartDetailService {
	public void addCartDetail(String status, CartEntity cart,ProductEntity product, ProductDTO productDTO);
}
