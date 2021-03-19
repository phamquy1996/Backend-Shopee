package com.backendshopee.service;

import com.backendshopee.dto.ClasifyDTO;
import com.backendshopee.entity.SubClassifyEntity;

public interface ISubClassifyService {
	public void addSubClassify(ClasifyDTO clasifyDTO, Long product_id, Long classify_id);
	public SubClassifyEntity findById(Long id);
}
