package com.backendshopee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.ClasifyDTO;
import com.backendshopee.entity.ClassifyEntity;
import com.backendshopee.entity.ProductEntity;
import com.backendshopee.entity.SubClassifyEntity;
import com.backendshopee.repository.SubClassifyRepository;
import com.backendshopee.service.IClassifyService;
import com.backendshopee.service.IProductService;
import com.backendshopee.service.ISubClassifyService;

@Service
public class SubClassifyService implements ISubClassifyService{

	@Autowired 
	SubClassifyRepository subClassifyRepository;
	
	@Autowired 
	IProductService iProductService;
	
	@Autowired 
	IClassifyService iClassifyService;
	
	@Override
	public void addSubClassify(ClasifyDTO clasifyDTO, Long product_id, Long classify_id) {
		System.out.print(product_id);
		for (SubClassifyEntity item: clasifyDTO.getSubClassifies()) {
			System.out.print(item.getName());
			SubClassifyEntity subClassifyEntity = new SubClassifyEntity();
			ProductEntity productEntity = iProductService.findById(product_id);
			ClassifyEntity classifyEntity = iClassifyService.findById(classify_id);
			subClassifyEntity.setProductEntity(productEntity);
			subClassifyEntity.setClassifyEntity(classifyEntity);
			subClassifyEntity.setName(item.getName());
			subClassifyEntity.setQty(item.getQty());
			subClassifyEntity.setPrice(item.getPrice());
			subClassifyRepository.save(subClassifyEntity);
		}
	}

	@Override
	public SubClassifyEntity findById(Long id) {
		// TODO Auto-generated method stub
		return subClassifyRepository.findById(id).get();
	}

}
