package com.backendshopee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public List<SubCategoryEntity> listSubCate() {
//		SubcategoryOutput subcategoryOutput = new SubcategoryOutput();
//		subcategoryOutput.setListCate(icategoryService.findAll());
//		subcategoryOutput.setListSubcate(iSubCategoryService.findAll());
		return iSubCategoryService.findAll();
	}
	
	@GetMapping("/listSubCateok")
	public List<SubCategoryEntity> listSubCates(@RequestParam(defaultValue = "3") Integer page,
			@RequestParam(defaultValue = "4") Integer pageSize
			) {
		List<SubCategoryEntity> list = iSubCategoryService.getAllEmployees(page, pageSize);
		System.out.print("So page " + page);
		return list;
	}
	
	@GetMapping("/listSubCateokok")
	public SubcategoryOutput listSubCatesok(@RequestParam(value = "keyword", required = false) String keyword,
			@RequestParam(value = "page", required = false) Integer page
			) {
		int limit = 2;
		Pageable pageable = PageRequest.of(page, limit);
		int totalPage = (int) Math.ceil((double) (iSubCategoryService.totalItem()) / limit);
//		System.out.print("Tong so page" + pages);
		SubcategoryOutput subcategoryOutput = new SubcategoryOutput();
		subcategoryOutput.setListSubcate(iSubCategoryService.findByLastnameOrFirstname(keyword,keyword,pageable));
		subcategoryOutput.setPage(page);
		subcategoryOutput.setTotalPage(totalPage);
		return subcategoryOutput;
	}
	
	@PostMapping("/addSubCategory")
	public void addCategory(@Valid @RequestBody SubcategoryDTO model) {
		iSubCategoryService.addSubCategory(model);
	}
}
