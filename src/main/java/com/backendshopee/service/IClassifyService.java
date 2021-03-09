package com.backendshopee.service;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.entity.ClassifyEntity;

public interface IClassifyService {
	public void addClassify (ProductDTO productDTO, Long product_id);
	public ClassifyEntity findById(Long id);
}
