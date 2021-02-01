package com.backendshopee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.repository.CategoryRepository;
import com.backendshopee.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService{
	@Autowired
	CategoryRepository categoryrepository;
	
	@Override
	public void save(CategoryEntity categoryentity) {
		categoryrepository.save(categoryentity);		
	}
	
	@Override
	public List<CategoryEntity> findAll() {
		// TODO Auto-generated method stub
		return (List<CategoryEntity>) categoryrepository.findAll();
	}
	
	@Override
	public void delete(Long id) {
		categoryrepository.deleteById(id);
	}
}
