package com.backendshopee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.ShippingEntity;
import com.backendshopee.repository.ShippingRepository;
import com.backendshopee.service.IShippingService;

@Service 
public class ShippingService implements IShippingService{

	@Autowired
	ShippingRepository shippingRepository;
	
	@Override
	public void addShipping(ShippingEntity shippingentity) {
		// TODO Auto-generated method stub
		shippingRepository.save(shippingentity);
	}

	@Override
	public List<ShippingEntity> allShipping() {
		// TODO Auto-generated method stub
		return shippingRepository.findAll();
	}

	@Override
	public ShippingEntity findById(Long id) {
		// TODO Auto-generated method stub
		return shippingRepository.findById(id).get();
	}

}
