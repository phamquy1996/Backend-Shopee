package com.backendshopee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.SubcategoryDTO;
import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.SubCategoryEntity;
import com.backendshopee.repository.CategoryRepository;
import com.backendshopee.repository.SubCategoryRepository;
import com.backendshopee.service.ICategoryService;
import com.backendshopee.service.ISubCategoryService;


@Service
public class SubCategoryService implements ISubCategoryService{
	
	@Autowired
	SubCategoryRepository subCategoryRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ICategoryService iCategoryService;
	
	@Override
	public List<SubCategoryEntity> findAll() {
		return (List<SubCategoryEntity>) subCategoryRepository.findAll();
	}
//	@Override
//	public void addSubCategory(SubcategoryDTO subcategoryDTO) {
//		// TODO Auto-generated method stub
//		CategoryRepository categoryRepository = categoryRepository.findById(subcategoryDTO.getCategory_id());
//		subCategoryRepository.save(subCategoryEntity);
//	}
	@Override
	public SubCategoryEntity findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addSubCategory(SubcategoryDTO subcategoryDTO) {
		SubCategoryEntity subCategoryEntity = new SubCategoryEntity();
		CategoryEntity categoryEntity = iCategoryService.findById(subcategoryDTO.getCategory_id());
		subCategoryEntity.setCategoryentity(categoryEntity);
		subCategoryEntity.setImage(subcategoryDTO.getImage());
		subCategoryEntity.setName(subcategoryDTO.getName());
		subCategoryEntity.setStatus(subcategoryDTO.getStatus());
//		subCategoryEntity.setImage(subcategoryDTO.getImage());
		subCategoryRepository.save(subCategoryEntity);
	}

}
