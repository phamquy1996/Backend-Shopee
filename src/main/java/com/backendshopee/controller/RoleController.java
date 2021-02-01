package com.backendshopee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.RoleEntity;
import com.backendshopee.service.IRoleService;

@RestController
public class RoleController {
	
	@Autowired
	IRoleService iroleservice;
	
	
	@PostMapping("/addRole")
	public RoleEntity addRole(@RequestBody RoleEntity model) {
		iroleservice.addRole(model);
		return model;
	}
}
