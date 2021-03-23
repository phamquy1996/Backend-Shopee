package com.backendshopee.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.CartDetailEntity;
import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.CartDetailRepository;
import com.backendshopee.service.ICartService;
import com.backendshopee.service.IUserService;


@RestController
@RequestMapping("/api/v1/cart")
public class CartController {
	
	@Autowired
	IUserService iUserService;
	
	@Autowired
	CartDetailRepository cartDetailRepository;
	
	@Autowired
	ICartService iCartService;
	
	@PostMapping("/addToCart")
	public void addToCart() {
		
	}
	
	@GetMapping("/allCart")
	public UserEntity allCart(Principal principal) {
		return iUserService.findByName(principal.getName());
	}
	
	@GetMapping("/allCartDetail")
	public CartDetailEntity allCartDetail() {
		long id = 1;
		return cartDetailRepository.findById(id).get();
	}
	
	@PutMapping(value = "/selectAllProductShopCart/{id}")
	public void selectAllProductCart(@PathVariable("id") long id) {
		iCartService.selectAllProductShopCart(id);
	}
	
	@DeleteMapping(value = "/deleteProductCart/{id}")
	public void deleteProductCart(@PathVariable("id") long id) {
		iCartService.deleteProductCart(id);
	}
	
	@GetMapping(value = "/changeProductCart/{id}")
	public CartDetailEntity changeProductCart(@PathVariable("id") long id) {
		return iCartService.changeProductCart(id);
	}
	
	@GetMapping(value = "/decreaseProductCart/{id}")
	public CartDetailEntity decreaseProductCart(@PathVariable("id") long id) {
		return iCartService.decreaseProductCart(id);
	}
	
}
