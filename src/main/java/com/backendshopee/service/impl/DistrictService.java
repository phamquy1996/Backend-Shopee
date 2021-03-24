package com.backendshopee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.DistrictDTO;
import com.backendshopee.entity.DistrictEntity;
import com.backendshopee.repository.DistrictRepository;
import com.backendshopee.service.IDistrictService;

@Service
public class DistrictService implements IDistrictService{

	@Autowired
	DistrictRepository districtRepository;
	@Override
	public List<DistrictDTO> findAll(int id) {
		// TODO Auto-generated method stub
		List<DistrictEntity> districtsEntity = districtRepository.findByProvinceId(id);
		List<DistrictDTO> districts = new ArrayList<>();
		for(DistrictEntity item:districtsEntity) {
			DistrictDTO district = new DistrictDTO();
			district.setProvince_id(item.getProvince_id());
			district.setId(item.getId());
			district.setPrefix(item.getPrefix());
			district.setName(item.getName());
			districts.add(district);
		}
		return districts;
	}

}
