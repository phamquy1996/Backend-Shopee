package com.backendshopee.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.backendshopee.dto.SubcategoryDTO;
import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.SubCategoryEntity;

public interface ISubCategoryService {

	public List<SubCategoryEntity> findAll();
	public void addSubCategory(SubcategoryDTO SubcategoryDTO);
	public SubCategoryEntity findById(Long id);
	public List<SubCategoryEntity> getAllEmployees(Integer pageNo, Integer pageSize);
	public List<SubCategoryEntity> findByLastnameOrFirstname(String pageNo, String pageSize);
	List<SubCategoryEntity> findByLastnameOrFirstname(String pageNo, String pageSize, Pageable pageable);
	int totalItem();
}
