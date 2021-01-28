package com.backendshopee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.service.ICategoryService;

@RestController

public class HomeController {
	@Autowired
	private ICategoryService icategoryservice;
	@PostMapping(value = "/new")
	public CategoryEntity getAllEmployees(@Valid @RequestBody CategoryEntity model ) {
		icategoryservice.save(model);
		return model;
	}
	
	@GetMapping(value = "/all")
	public @ResponseBody List<CategoryEntity> getAllCategory() {
		List<CategoryEntity> cate = icategoryservice.findAll();
		return cate;
	}
	
	@GetMapping(value = "/eliminar/{id}")
	public Number eliminar(@PathVariable(value = "id") Long id) {
		icategoryservice.delete(id);
		return id;
	}
}
