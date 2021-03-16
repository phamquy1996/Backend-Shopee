package com.backendshopee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void addCartDetail(String status, CartEntity cart, ProductEntity product) {
		// TODO Auto-generated method stub
		if(status=="update") {
			List<CartDetailEntity> cartDetails = cartDetailRepository.findAll(); 
			for(CartDetailEntity item:cartDetails) {
				if(item.getProduct().equals(product)) {
					item.setProduct(product);
					item.setCart(cart);
					item.setQty(item.getQty() + 1);
					cartDetailRepository.save(item);
					return;
				}
			}
			CartDetailEntity cartDetail = new CartDetailEntity(); 
			cartDetail.setProduct(product);
			cartDetail.setCart(cart);
			cartDetail.setQty(1);
			cartDetail.setStatus(1);
			cartDetailRepository.save(cartDetail);
		}else {
			CartDetailEntity cartDetail = new CartDetailEntity(); 
			cartDetail.setProduct(product);
			cartDetail.setCart(cart);
			cartDetail.setQty(1);
			cartDetail.setStatus(1);
			cartDetailRepository.save(cartDetail);
		}
		
	}
}
