package com.backendshopee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.api.client.output.CategoryAndListProductOutput;
import com.backendshopee.dto.ProductDTO;
import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.repository.CategoryRepository;
import com.backendshopee.service.ICategoryService;
@RestController
@RequestMapping("/api/v1")
public class CateController {
	
	@Autowired
	ICategoryService iCategoryService;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@PostMapping("/addCate")
	public String addCate(@Valid @RequestBody CategoryEntity model) {
		iCategoryService.save(model);
		return "anhquy";
	}
	
	@GetMapping("/allCate")
	public List<CategoryEntity> addCate(){
		return iCategoryService.findAll();
	}
	
	
	@GetMapping("/allCate/{id}")
	public List<ProductDTO> addCate(@PathVariable(value = "id") Long id){
		int limit = 2;
		int page = 1;
		long ida = 1;
		CategoryEntity category = iCategoryService.findById(ida);
		Pageable pageable = PageRequest.of(page, limit);
		return categoryRepository.findByPr(category , pageable);
	}
	
	@GetMapping("/allCates/{id}")
	public CategoryAndListProductOutput allCates(@PathVariable(value = "id") Long id){
		int limit = 2;
		int page = 1;
		long ida = 1;
		CategoryEntity category = iCategoryService.findById(ida);
		Pageable pageable = PageRequest.of(page, limit);
		return iCategoryService.findByCategory(id,page);
	}
}
