package com.backendshopee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.service.ICategoryService;
@RestController
@RequestMapping("/api/v1")
public class CateController {
	
	@Autowired
	ICategoryService iCategoryService;
	
	@PostMapping("/addCate")
	public String addCate(@Valid @RequestBody CategoryEntity model) {
		iCategoryService.save(model);
		return "anhquy";
	}
	
	@GetMapping("/allCate")
	public List<CategoryEntity> addCate(){
		return iCategoryService.findAll();
	}
}
