package com.backendshopee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.ChildCategoryDTO;
import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.ChildCategoryEntity;
import com.backendshopee.entity.SubCategoryEntity;
import com.backendshopee.repository.CategoryRepository;
import com.backendshopee.repository.ChildCategoryRepository;
import com.backendshopee.repository.SubCategoryRepository;
import com.backendshopee.service.ICategoryService;
import com.backendshopee.service.IChildCategoryService;
import com.backendshopee.service.ISubCategoryService;

@Service
public class ChildCategoryService implements IChildCategoryService{

	
	@Autowired
	SubCategoryRepository subCategoryRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ChildCategoryRepository childCategoryRepository;
	
	@Autowired
	ISubCategoryService iSubCategoryService;
	
	@Autowired
	ICategoryService iCategoryService;
	
	@Override
	public void addSubCategory(ChildCategoryDTO childCategoryDTO) {
		// TODO Auto-generated method stub
		System.out.print(childCategoryDTO);
		ChildCategoryEntity childCategoryEntity = new ChildCategoryEntity();
		CategoryEntity categoryEntity = iCategoryService.findById(childCategoryDTO.getCategory_id());
		SubCategoryEntity subcategoryEntity = iSubCategoryService.findById(childCategoryDTO.getCategory_id());
		childCategoryEntity.setCategoryentity(categoryEntity);
		childCategoryEntity.setSubCategoryEntity(subcategoryEntity);
		childCategoryEntity.setName(childCategoryDTO.getName());
		childCategoryEntity.setStatus(childCategoryDTO.getStatus());
		childCategoryRepository.save(childCategoryEntity);
	}

}
