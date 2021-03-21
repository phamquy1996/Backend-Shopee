package com.backendshopee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.BillEntity;
import com.backendshopee.service.IBillService;

@RestController
@RequestMapping("/api/v1/checkout")
public class CheckoutController {
	
	@Autowired
	IBillService iBillService;
	
	@PostMapping("/addProductCheckout")
	public void addToCart() {
		iBillService.checkout();
	}
	
	@GetMapping(value = "/bill/{id}")
	public BillEntity bill(@PathVariable(value = "id") Long id) {
		return iBillService.findById(id);
	}
}
