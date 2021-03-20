package com.backendshopee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.BillEntity;
import com.backendshopee.entity.CartEntity;
import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.BillRepository;
import com.backendshopee.service.IBillService;
import com.backendshopee.service.IUserService;

@Service
public class BillService implements IBillService{
	
	@Autowired
	IUserService iUserService;
	
	@Autowired
	BillRepository billRepository;
	
	@Override
	public void checkout() {
		UserEntity user = iUserService.findByName("admin");
		for(CartEntity item:user.getCarts()) {
			if(item.getCartDetails().isEmpty()) {
				BillEntity billEntity = new BillEntity();
//				billEntity.
			}
		}
	}

}
