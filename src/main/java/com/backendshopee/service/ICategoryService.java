package com.backendshopee.service;

import com.backendshopee.entity.CategoryEntity;

import java.util.List;

public interface ICategoryService {
	public List<CategoryEntity> findAll();
	public void save(CategoryEntity categoryEntity);
	public void delete (Long id);
}
