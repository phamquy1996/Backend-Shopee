package com.backendshopee.service;

import com.backendshopee.dto.ChildCategoryDTO;
import com.backendshopee.entity.ChildCategoryEntity;

public interface IChildCategoryService {
	
	public void addSubCategory(ChildCategoryDTO ChildCategoryDTO);
	public ChildCategoryEntity findById(Long id);
}
