package com.backendshopee.service;

import com.backendshopee.dto.ClasifyDTO;

public interface ISubClassifyService {
	public void addSubClassify(ClasifyDTO clasifyDTO, Long product_id, Long classify_id);
}
