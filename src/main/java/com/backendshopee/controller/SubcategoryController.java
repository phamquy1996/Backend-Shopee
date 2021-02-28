package com.backendshopee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.api.admin.output.SubcategoryOutput;
import com.backendshopee.dto.SubcategoryDTO;
import com.backendshopee.entity.SubCategoryEntity;
import com.backendshopee.service.ICategoryService;
import com.backendshopee.service.ISubCategoryService;

@RestController
@RequestMapping("/api/v1")
public class SubcategoryController {
	
	@Autowired
	ICategoryService icategoryService; 
	
	@Autowired
	ISubCategoryService iSubCategoryService;
	
	@GetMapping("/listSubCate")
	public SubcategoryOutput listSubCate() {
		SubcategoryOutput subcategoryOutput = new SubcategoryOutput();
		subcategoryOutput.setListCate(icategoryService.findAll());
		subcategoryOutput.setListSubcate(iSubCategoryService.findAll());
		return subcategoryOutput;
	}
	
	@GetMapping("/listSubCates")
	public List<SubCategoryEntity> listSubCates() {
		return iSubCategoryService.findAll();
	}
	
	@PostMapping("/addSubCategory")
	public void addCategory(@Valid @RequestBody SubcategoryDTO model) {
		System.out.print(model.getName());
//		model.setRoles(iRoleService.findByRole("ADMIN"));
//		model.setCategoryentity(icategoryService.findById(model.getId()));
		iSubCategoryService.addSubCategory(model);
	}
}
