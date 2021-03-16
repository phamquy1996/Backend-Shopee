package com.backendshopee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.CartDetailEntity;
import com.backendshopee.entity.CartEntity;
import com.backendshopee.entity.ProductEntity;
import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.CartDetailRepository;
import com.backendshopee.repository.CartRepository;
import com.backendshopee.service.ICartDetailService;
import com.backendshopee.service.ICartService;
import com.backendshopee.service.IProductService;
import com.backendshopee.service.IUserService;
@Service
public class CartService implements ICartService {

	@Autowired 
	CartRepository cartRepository;
	
	@Autowired 
	CartDetailRepository cartDetailRepository;
	
	@Autowired 
	IProductService iProductService;
	
	@Autowired 
	IUserService iUserService;
	
	@Autowired 
	ICartDetailService iCartDetailService;
	
	@Override
	public boolean addToCart(Long id) {
		ProductEntity product = iProductService.findById(id);
		UserEntity userSaler = iUserService.findById(product.getUserSalerid());
		UserEntity userBuyer = iUserService.findByName("admin");
		
		List<CartEntity> cartfind = (List<CartEntity>) cartRepository.findByUseridbuyerAndUseridsaler(userSaler, userBuyer);
		if(cartfind.isEmpty()) {
			System.out.print("empty");
			CartEntity cart = new CartEntity();
//			cart.setUser_saler(userSaler);
			cart.setUser(userBuyer);
			cart.setUser_buyer(userSaler);
			cartRepository.save(cart);
			String status = "add";
			iCartDetailService.addCartDetail(status, cart, product);
		}else {
			System.out.print(cartfind.get(0).getId());
			String status = "update";
			iCartDetailService.addCartDetail(status,  cartfind.get(0), product);
		}

		return false;
	}

	@Override
	public void selectAllProductShopCart(Long id) {
		// TODO Auto-generated method stub
		CartEntity cart = cartRepository.findById(id).get();
		for(CartDetailEntity item:cart.getCartDetails()) {
			if((int)item.getStatus() == 1) {
				item.setStatus(0);
			}else {
				item.setStatus(1);
			}
			cartDetailRepository.save(item);
		}
	}

	@Override
	public CartEntity findById(Long id) {
		// TODO Auto-generated method stub
		return cartRepository.findById(id).get();
	}

	@Override
	public void deleteProductCart(Long id) {
		// TODO Auto-generated method stub
		cartDetailRepository.deleteById(id);
	}

	@Override
	public CartDetailEntity changeProductCart(Long id) {
		// TODO Auto-generated method stub
		CartDetailEntity cartDetail = cartDetailRepository.findById(id).get();
		cartDetail.setQty(cartDetail.getQty() + 1);
		cartDetailRepository.save(cartDetail);
		return cartDetail;
	}

	@Override
	public CartDetailEntity decreaseProductCart(Long id) {
		CartDetailEntity cartDetail = cartDetailRepository.findById(id).get();
		cartDetail.setQty(cartDetail.getQty() - 1);
		cartDetailRepository.save(cartDetail);
		return cartDetail;
	}

}
