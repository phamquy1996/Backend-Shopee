package com.backendshopee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.ImagesDTO;
import com.backendshopee.entity.MulImageProductEntity;
import com.backendshopee.entity.ProductEntity;
import com.backendshopee.repository.MulImageRepository;
import com.backendshopee.service.IImageService;
import com.backendshopee.service.IProductService;

@Service
public class ImageService implements IImageService{

	@Autowired
	MulImageRepository mulImageRepository;
	
	@Autowired
	IProductService iProductService;
	
	@Override
	public void addImage(List<ImagesDTO> imagesDTO, Long id) {
		// TODO Auto-generated method stub
		List<MulImageProductEntity> mulImages= new ArrayList<>();
		for(ImagesDTO item:imagesDTO) {
			MulImageProductEntity mulImageProductEntity = new MulImageProductEntity();
			ProductEntity productEntity = iProductService.findById(id);
			mulImageProductEntity.setProductEntity(productEntity);
			mulImageProductEntity.setImage(item.getImage());
			mulImages.add(mulImageProductEntity);
		}
		mulImageRepository.saveAll(mulImages);
	}

}
