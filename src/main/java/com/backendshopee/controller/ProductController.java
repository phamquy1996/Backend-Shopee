package com.backendshopee.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.dto.ProductDTO;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	@PostMapping("/add")
	public ProductDTO add(@Valid @RequestBody ProductDTO model) {
		return model;
	}
}
