package com.backendshopee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.repository.CategoryRepository;
import com.backendshopee.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService{
	@Autowired
	ICategoryService icategoryservice;
	
	@Override
	public void save(CategoryEntity categoryentity) {
		icategoryservice.save(categoryentity);		
	}
}
