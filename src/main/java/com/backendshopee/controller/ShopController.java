package com.backendshopee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.UserEntity;
import com.backendshopee.service.IUserService;

@RestController
@RequestMapping("/api/v1/shop")
public class ShopController {
	@Autowired 
	IUserService iUserService;
	
	@GetMapping("/allProduct/{id}")
	public UserEntity allProduct(@PathVariable("id") long id){
		return iUserService.findById(id);
	}
}
