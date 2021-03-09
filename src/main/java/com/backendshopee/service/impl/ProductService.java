package com.backendshopee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.ChildCategoryEntity;
import com.backendshopee.entity.ProductEntity;
import com.backendshopee.entity.SubCategoryEntity;
import com.backendshopee.repository.ProductRepository;
import com.backendshopee.service.ICategoryService;
import com.backendshopee.service.IChildCategoryService;
import com.backendshopee.service.IClassifyService;
import com.backendshopee.service.IProductService;
import com.backendshopee.service.ISubCategoryService;

@Service
public class ProductService implements IProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ICategoryService iCategoryService;
	
	@Autowired
	IChildCategoryService iChildCategoryService;
	
	@Autowired
	ISubCategoryService iSubCategoryService;
	
	@Autowired
	IClassifyService iClassifyService;
	
	public void addProduct(ProductDTO productDTO) {
		ProductEntity productEntity = new ProductEntity();
		CategoryEntity categoryEntity = iCategoryService.findById(productDTO.getCategory_id());
		ChildCategoryEntity childCategoryEnyity = iChildCategoryService.findById(productDTO.getChildcategory_id());
		SubCategoryEntity subCategoryEntity = iSubCategoryService.findById(productDTO.getSubcategory_id());
		productEntity.setCategoryentity(categoryEntity);
		productEntity.setChildCategoryEntity(childCategoryEnyity);
		productEntity.setSubCategoryEntity(subCategoryEntity);
		productEntity.setGram(productDTO.getGram());
		
		productRepository.save(productEntity);
		
		iClassifyService.addClassify(productDTO,productEntity.getId());
		System.out.println(productEntity.getId());
	}

	@Override
	public ProductEntity findById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}
}
