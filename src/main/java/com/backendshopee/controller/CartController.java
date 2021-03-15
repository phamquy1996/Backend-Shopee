package com.backendshopee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.CartDetailEntity;
import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.CartDetailRepository;
import com.backendshopee.service.IUserService;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {
	
	@Autowired
	IUserService iUserService;
	
	@Autowired
	CartDetailRepository cartDetailRepository;
	
	@PostMapping("/addToCart")
	public void addToCart() {
		
	}
	
	@GetMapping("/allCart")
	public UserEntity allCart() {
		return iUserService.findByName("admin");
	}
	
	@GetMapping("/allCartDetail")
	public CartDetailEntity allCartDetail() {
		long id = 1;
		return cartDetailRepository.findById(id).get();
	}
}
