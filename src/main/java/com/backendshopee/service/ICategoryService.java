package com.backendshopee.service;

import java.util.List;

import com.backendshopee.entity.CategoryEntity;

public interface ICategoryService {
	public List<CategoryEntity> findAll();
	public void save(CategoryEntity categoryEntity);
	public void delete (Long id);
	public CategoryEntity findById(Long id);
}
