package com.backendshopee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.ShippingEntity;
import com.backendshopee.service.IShippingService;

@RestController
@RequestMapping(value = "/api/v1/shipping")
public class ShippingController {
	
	@Autowired
	IShippingService iShippingService;
	
	@PostMapping("/add")
	public void add(@Valid @RequestBody ShippingEntity model ) {
		System.out.print(model.getMaxgram());
		iShippingService.addShipping(model);
	}
	
	@GetMapping("/all")
	public List<ShippingEntity> all(){
		return iShippingService.allShipping();
	}
}
