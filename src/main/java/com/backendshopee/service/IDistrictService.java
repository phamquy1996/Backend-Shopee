package com.backendshopee.service;

import java.util.List;

import com.backendshopee.dto.DistrictDTO;

public interface IDistrictService {
	public List<DistrictDTO> findAll(int id);
}
