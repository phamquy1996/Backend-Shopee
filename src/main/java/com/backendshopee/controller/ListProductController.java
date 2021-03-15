package com.backendshopee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.service.ICategoryService;
import com.backendshopee.service.ISubCategoryService;

@RestController
@RequestMapping("/api/v1/listProduct")
public class ListProductController {
	
	@Autowired
	ICategoryService iCategoryService;
	
	@Autowired
	ISubCategoryService iSubCategoryService;
	
	@GetMapping("/listProductCate/{id}")
	public CategoryEntity listProductCate(@PathVariable(value = "id") Long id){
		return iCategoryService.findById(id);
	}
	
	@GetMapping("/listProductSubcate/{id}")
	public CategoryEntity listProductSubcate(@PathVariable(value = "id") Long id){
//		System.out.print(id);
		return iSubCategoryService.findBySubCateAndProduct(id);
	}
}
