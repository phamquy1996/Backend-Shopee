package com.backendshopee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.SubcategoryDTO;
import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.SubCategoryEntity;
import com.backendshopee.repository.CategoryRepository;
import com.backendshopee.repository.PaginateRepository;
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
	
	@Autowired
	PaginateRepository paginateRepository;
	
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
		return subCategoryRepository.findById(id).get();
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
	@Override
	public List<SubCategoryEntity> getAllEmployees(Integer pageNo, Integer pageSize) {
		// TODO Auto-generated method stub
		Pageable paging = PageRequest.of(pageNo, pageSize);
		 
        Page<SubCategoryEntity> pagedResult = paginateRepository.findAll(paging);
        pagedResult.filter(null);
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<SubCategoryEntity>();
        }
	}

	@Override
	public List<SubCategoryEntity> findByLastnameOrFirstname(String pageNo, String pageSize, Pageable pageable) {
		System.out.print(pageNo + pageSize + pageable);
		List<SubCategoryEntity> anhquy = (List<SubCategoryEntity>) subCategoryRepository.findByLastnameOrFirstname(pageNo,pageSize,pageable);
		return anhquy;
	}
	
	@Override
	public List<SubCategoryEntity> findByLastnameOrFirstname(String pageNo, String pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int totalItem() {
		// TODO Auto-generated method stub
		return (int) subCategoryRepository.count();
	}

}
