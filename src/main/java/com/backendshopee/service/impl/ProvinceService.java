package com.backendshopee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.ProvinceDTO;
import com.backendshopee.entity.ProvinceEntity;
import com.backendshopee.repository.ProvinceRepository;
import com.backendshopee.service.IProvinceService;

@Service
public class ProvinceService implements IProvinceService{
	
	@Autowired 
	ProvinceRepository provinceRepository;
	
	@Override
	public List<ProvinceDTO> findAll() {
		// TODO Auto-generated method stub
		List<ProvinceDTO> provinces = new ArrayList<>();
		List<ProvinceEntity> provincesEntity = provinceRepository.findAll();
		for(ProvinceEntity item:provincesEntity) {
			ProvinceDTO province = new ProvinceDTO();
			province.setCode(item.getCode());
			province.setId(item.getId());
			province.setName(item.getName());
			provinces.add(province);
		}
		return provinces;
	}

}
