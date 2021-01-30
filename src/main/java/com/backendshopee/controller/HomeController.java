package com.backendshopee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.service.ICategoryService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class HomeController {
	@Autowired
	private ICategoryService icategoryservice;
	@Autowired
	private BCryptPasswordEncoder anhquy;
	@PostMapping(value = "/new")
	public String getAllEmployees(@Valid @RequestBody CategoryEntity model ) {
		icategoryservice.save(model);
		String a = anhquy.encode(model.getName());
		return a;
	}
	
	@GetMapping(value = "/all")
	public List<CategoryEntity> getAllCategory() {
		List<CategoryEntity> cate = icategoryservice.findAll();
		return cate;
	}
	
	@GetMapping(value = "/eliminar/{id}")
	public Number eliminar(@PathVariable(value = "id") Long id) {
		icategoryservice.delete(id);
		return id;
	}
}
