package com.backendshopee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.api.client.output.CategoryAndListProductOutput;
import com.backendshopee.dto.SearchProductDTO;
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
	public CategoryAndListProductOutput listProductCate(@RequestParam(value = "page", defaultValue = "0",required=false) Integer page, 
			@RequestParam(value = "minPrice", defaultValue = "0", required = false) Integer minPrice,
			@PathVariable(value = "id") Long id){
		SearchProductDTO search = new SearchProductDTO();
		System.out.print("ppppppppppppppppppppppp+ " + minPrice);
		search.setPage(page);
//		search.setMinPrice(minPrice);
		if(page == null) {
			return iCategoryService.findByCategory(id, 0, search);
		}else {
			return iCategoryService.findByCategory(id, page, search);
		}
		
	}
	
	@GetMapping("/listProductSubcate/{id}")
	public CategoryEntity listProductSubcate(@PathVariable(value = "id") Long id){
//		System.out.print(id);
		return iSubCategoryService.findBySubCateAndProduct(id);
	}
}
