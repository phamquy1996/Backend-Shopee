package com.backendshopee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.service.ICartService;
import com.backendshopee.service.IUserService;

@RestController
@RequestMapping("/api/v1/detail")
public class DetailController {
	
	@Autowired
	IUserService iUserService;
	
	@Autowired
	ICartService iCartService;
	
	@PostMapping("/favorite")
	public ProductDTO favorite(@RequestBody ProductDTO model) {
		System.out.print(model.getId());
		iUserService.favoriteProduct(model.getId());
		return null;
	}
	
	@PostMapping("/addToCart")
	public ProductDTO addToCart(@Valid @RequestBody ProductDTO model) {
		iCartService.addToCart(model);
		return model;
	}
}
