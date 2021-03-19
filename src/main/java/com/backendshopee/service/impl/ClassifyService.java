package com.backendshopee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.ClasifyDTO;
import com.backendshopee.dto.ProductDTO;
import com.backendshopee.entity.ClassifyEntity;
import com.backendshopee.entity.ProductEntity;
import com.backendshopee.repository.ClassifyRepository;
import com.backendshopee.service.IClassifyService;
import com.backendshopee.service.IProductService;
import com.backendshopee.service.ISubClassifyService;

@Service 
public class ClassifyService implements IClassifyService {
	
	@Autowired
	ClassifyRepository classifyRepository;
	
	@Autowired
	IProductService iProductService;
	
	@Autowired
	ISubClassifyService iSubClassifyService;

	@Override
	public void addClassify(ProductDTO productDTO, Long product_id) {
		for (ClasifyDTO item: productDTO.getClasifyDTO()) {
			ClassifyEntity classifyentity = new ClassifyEntity();
			ProductEntity productEntity = iProductService.findById(product_id);
			classifyentity.setProductEntity(productEntity);
			classifyentity.setName(item.getName());
			classifyentity.setPrice(item.getPrice());
			classifyentity.setQty(item.getQty());
//			classifyentity.setImage(item.getImage);
			classifyRepository.save(classifyentity);
			iSubClassifyService.addSubClassify(item, product_id, classifyentity.getId());
		}
	}

	@Override
	public ClassifyEntity findById(Long id) {
		// TODO Auto-generated method stub
		return classifyRepository.findById(id).get();
	}
}
