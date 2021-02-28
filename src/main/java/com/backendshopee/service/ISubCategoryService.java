package com.backendshopee.service;

import java.util.List;

import com.backendshopee.dto.SubcategoryDTO;
import com.backendshopee.entity.SubCategoryEntity;

public interface ISubCategoryService {

	public List<SubCategoryEntity> findAll();
	public void addSubCategory(SubcategoryDTO SubcategoryDTO);
	public SubCategoryEntity findById(Long id);
}
