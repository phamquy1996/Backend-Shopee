package com.backendshopee.service;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.entity.CartDetailEntity;
import com.backendshopee.entity.CartEntity;

public interface ICartService {
	
	public CartEntity findById(Long id);
	public boolean addToCart(ProductDTO ProductDTO);
	public void selectAllProductShopCart(Long id);
	public void deleteProductCart(Long id);
	public CartDetailEntity changeProductCart(Long id);
	public CartDetailEntity decreaseProductCart(Long id);
}
