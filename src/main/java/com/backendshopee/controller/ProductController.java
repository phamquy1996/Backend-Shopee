package com.backendshopee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.service.IProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	
	@Autowired
	IProductService iProductService;
	
	@PostMapping("/add")
	public ProductDTO add(@Valid @RequestBody ProductDTO model) {
		iProductService.addProduct(model);
		return model;
	}
}
