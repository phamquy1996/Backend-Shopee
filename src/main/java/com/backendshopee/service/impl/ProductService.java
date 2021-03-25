package com.backendshopee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.dto.ShippingDTO;
import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.ChildCategoryEntity;
import com.backendshopee.entity.ProductEntity;
import com.backendshopee.entity.ShippingEntity;
import com.backendshopee.entity.SubCategoryEntity;
import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.ProductRepository;
import com.backendshopee.service.ICategoryService;
import com.backendshopee.service.IChildCategoryService;
import com.backendshopee.service.IClassifyService;
import com.backendshopee.service.IImageService;
import com.backendshopee.service.IProductService;
import com.backendshopee.service.ISubCategoryService;
import com.backendshopee.service.IUserService;

@Service
public class ProductService implements IProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ICategoryService iCategoryService;
	
	@Autowired
	IChildCategoryService iChildCategoryService;
	
	@Autowired
	ISubCategoryService iSubCategoryService;
	
	@Autowired
	IClassifyService iClassifyService;
	
	@Autowired
	IImageService iImageService;
	
	@Autowired
	IUserService iUserService;
	
	public void addProduct(ProductDTO productDTO) {
		ProductEntity productEntity = new ProductEntity();
		CategoryEntity categoryEntity = iCategoryService.findById(productDTO.getCategory_id());
		ChildCategoryEntity childCategoryEnyity = iChildCategoryService.findById(productDTO.getChildcategory_id());
		SubCategoryEntity subCategoryEntity = iSubCategoryService.findById(productDTO.getSubcategory_id());
		UserEntity userEntity = iUserService.findById(productDTO.getUserSaler_id());
		productEntity.setUserEntity(userEntity);
		productEntity.setCategoryentity(categoryEntity);
		productEntity.setChildCategoryEntity(childCategoryEnyity);
		productEntity.setSubCategoryEntity(subCategoryEntity);
		productEntity.setGram(productDTO.getGram());
		productEntity.setPrice(productDTO.getPrice());
		productEntity.setQty(productDTO.getQty());
		productEntity.setPricemax(productDTO.getPricemax());
		productEntity.setPricemin(productDTO.getPricemin());
		productEntity.setVideo(productDTO.getVideo());
		productEntity.setIsNew(productDTO.getIsNew());
		productEntity.setIsOrderBefore(productDTO.getIsOrderBefore());
		productEntity.setClassfly(productDTO.getClassfly());
		productEntity.setSubclassfly(productDTO.getSubclassify());
		productEntity.setName(productDTO.getName());
		productEntity.setImage(productDTO.getImage());
		List<ShippingEntity> shippings = new ArrayList<>();
		for(ShippingDTO item:productDTO.getShippings()) {
			ShippingEntity shippingEntity = new ShippingEntity();
			shippingEntity.setId(item.getId());
			shippingEntity.setMaxgram(item.getMaxgram());
			shippingEntity.setMingram(item.getMingram());
			shippingEntity.setName(item.getName());
			shippingEntity.setMoney_shipping(item.getMoney_shipping());
			shippings.add(shippingEntity);
		}
		
		productEntity.setShippings(shippings);
		productRepository.save(productEntity);
		
		iClassifyService.addClassify(productDTO, productEntity.getId());
		iImageService.addImage(productDTO.getImagesDTO(), productEntity.getId());
		System.out.println(productEntity.getId());
	}

	@Override
	public ProductEntity findById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	@Override
	public List<ProductEntity> all() {
		// TODO Auto-generated method stub
		return (List<ProductEntity>) productRepository.findAll();
	}

	@Override
	public ProductEntity findByProduct(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

}
