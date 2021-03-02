package com.backendshopee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.api.admin.output.ChildCategoryOutput;
import com.backendshopee.dto.ChildCategoryDTO;
import com.backendshopee.service.ICategoryService;
import com.backendshopee.service.IChildCategoryService;
import com.backendshopee.service.ISubCategoryService;

@RestController
@RequestMapping("/api/v1")
public class ChildController {
	
	@Autowired
	ICategoryService icategoryService;
	
	@Autowired
	ISubCategoryService iSubCategoryService;
	
	@Autowired
	IChildCategoryService iChildCategoryService;
	
	
	@GetMapping(value = "/addChildCate")
	public ChildCategoryOutput addChildCate() {
		ChildCategoryOutput childCategoryOutput = new ChildCategoryOutput();
		childCategoryOutput.setListCategory(icategoryService.findAll());
		childCategoryOutput.setListSubcate(iSubCategoryService.findAll());;
		return childCategoryOutput;
	}
	
	@PostMapping("/addChildCategory")
	public void addChildCategory(@Valid @RequestBody ChildCategoryDTO model) {
//		iSubCategoryService.addSubCategory(model);
		iChildCategoryService.addSubCategory(model);
	}
}
