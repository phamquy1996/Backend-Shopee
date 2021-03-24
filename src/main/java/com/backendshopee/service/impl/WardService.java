package com.backendshopee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.WardDTO;
import com.backendshopee.entity.WardEntity;
import com.backendshopee.repository.WardRepository;
import com.backendshopee.service.IWardService;

@Service
public class WardService implements IWardService {
	
	@Autowired
	WardRepository wardRepository;
	
	@Override
	public List<WardDTO> findAll(int id) {
		List<WardEntity> wardsEntity = wardRepository.findByDistrictId(id);
		List<WardDTO> wards = new ArrayList<>();
		for(WardEntity item:wardsEntity) {
			WardDTO ward = new WardDTO();
			ward.setProvince_id(item.getProvince_id());
			ward.setId(item.getId());
			ward.setPrefix(item.getPrefix());
			ward.setName(item.getName());
			wards.add(ward);
		}
		return wards;
	}

}
