package com.backendshopee.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.backendshopee.api.client.output.CategoryAndListProductOutput;
import com.backendshopee.dto.Products;
import com.backendshopee.dto.ProvinceDTO;
import com.backendshopee.dto.SearchProductDTO;
import com.backendshopee.dto.SubcategoryDTO;
import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.ProductEntity;
import com.backendshopee.entity.ProvinceEntity;
import com.backendshopee.entity.SubCategoryEntity;
import com.backendshopee.repository.CategoryRepository;
import com.backendshopee.repository.ProductRepository;
import com.backendshopee.repository.ProvinceRepository;
import com.backendshopee.repository.SubCategoryRepository;
import com.backendshopee.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService{
	@Autowired
	CategoryRepository categoryrepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProvinceRepository provinceRepository;
	
	@Autowired
	SubCategoryRepository subCategoryRepository;
	
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

	@Override
	public CategoryEntity findById(Long id) {
		// TODO Auto-generated method stub
		return categoryrepository.findById(id).get();
	}

	@Override
	public CategoryAndListProductOutput findByCategory(Long id, int page, SearchProductDTO searchProductDTO) {
		// TODO Auto-generated method stub
//		Sort sort = Sort.by(
//			    Sort.Order.desc("pricemax"),
//			    Sort.Order.desc("price"));
		
		Sort sort = Sort.by("pricemax").descending()
				  .and(Sort.by("price").descending());
		int limit = 15;
		Pageable pageable = PageRequest.of(searchProductDTO.getPage(), limit, sort);
		CategoryEntity categoryEntity = categoryrepository.findById(id).get();
		ModelMapper modelMapper = new ModelMapper();
		CategoryAndListProductOutput categoryAndListProductOutput = new CategoryAndListProductOutput();
		categoryAndListProductOutput.setImage(categoryEntity.getImage());
		categoryAndListProductOutput.setName(categoryEntity.getName());
		categoryAndListProductOutput.setId(categoryEntity.getId());
		categoryAndListProductOutput.setTotalPage((long) Math.ceil((double) (productRepository.totalProductByCategory(categoryEntity, searchProductDTO)) / limit));
		List<ProductEntity> productsEntity = productRepository.findByCategory(categoryEntity, searchProductDTO, pageable);
		List<SubCategoryEntity> subcategories = subCategoryRepository.findBySubcategoryByCategory(categoryEntity);
		for(ProductEntity item:productsEntity) {
			Products products = modelMapper.map(item, Products.class);
			products.setImage(item.getImage());
			categoryAndListProductOutput.getProducts().add(products);
		}
		for(SubCategoryEntity item:subcategories) {
			SubcategoryDTO subcategoryDTO = modelMapper.map(item, SubcategoryDTO.class);
			categoryAndListProductOutput.getSubCategories().add(subcategoryDTO); 
		}
		List<ProvinceEntity> provinceEntity = provinceRepository.findAll();
		for(ProvinceEntity item:provinceEntity) {
			ProvinceDTO provinceDTO = modelMapper.map(item, ProvinceDTO.class);
			categoryAndListProductOutput.getProvinces().add(provinceDTO); 
		}
		return categoryAndListProductOutput;
	}
	
}
