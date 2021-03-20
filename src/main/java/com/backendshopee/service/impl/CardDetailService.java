package com.backendshopee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.entity.CartDetailEntity;
import com.backendshopee.entity.CartEntity;
import com.backendshopee.entity.ProductEntity;
import com.backendshopee.repository.CartDetailRepository;
import com.backendshopee.service.ICartDetailService;

@Service
public class CardDetailService implements ICartDetailService {
	
	@Autowired
	CartDetailRepository cartDetailRepository;  
	
	@Override
	public void addCartDetail(String status, CartEntity cart, ProductEntity product,ProductDTO productDTO) {
		// TODO Auto-generated method stub
		int check = 0;
		if(status=="update") {
			List<CartDetailEntity> cartDetails = cart.getCartDetails(); 
			for(CartDetailEntity item:cartDetails) {
				if(item.getProduct().equals(product)) {
//					if(cart.getCartDetails().contains(productDTO))
					if(productDTO.getClassify_id() != null && productDTO.getSubclassify_id() != null && item.getClassify_id() != null && item.getSubclassify_id() != null) {
						 if((int)item.getClassify_id() == (int)productDTO.getClassify_id() && (int)item.getSubclassify_id() == (int)productDTO.getSubclassify_id()) {
							item.setProduct(product);
							item.setCart(cart);
							item.setQty(item.getQty() + productDTO.getQty());
							cartDetailRepository.save(item);
							return;
						}
					}else if(productDTO.getClassify_id() != null && productDTO.getSubclassify_id() == null && item.getClassify_id() != null && item.getSubclassify_id() == null) {
						 if((int)item.getClassify_id() == (int)productDTO.getClassify_id()) {
							item.setProduct(product);
							item.setCart(cart);
							item.setQty(item.getQty() + productDTO.getQty());
							cartDetailRepository.save(item);
							return;
						}
					}
					else {
						item.setProduct(product);
						item.setCart(cart);
						item.setQty(item.getQty() + productDTO.getQty());
						cartDetailRepository.save(item);
						return;
					}
				}
			}
			CartDetailEntity cartDetail = new CartDetailEntity(); 
			cartDetail.setProduct(product);
			cartDetail.setCart(cart);
			cartDetail.setQty(productDTO.getQty());
			cartDetail.setClassify_id(productDTO.getClassify_id());
			cartDetail.setSubclassify_id(productDTO.getSubclassify_id());
			cartDetail.setStatus(1);
			cartDetailRepository.save(cartDetail);
		}else {
			CartDetailEntity cartDetail = new CartDetailEntity(); 
			cartDetail.setProduct(product);
			cartDetail.setCart(cart);
			cartDetail.setQty(1);
			cartDetail.setClassify_id(productDTO.getClassify_id());
			cartDetail.setSubclassify_id(productDTO.getSubclassify_id());
			cartDetail.setStatus(1);
			cartDetailRepository.save(cartDetail);
		}
		
	}
}
