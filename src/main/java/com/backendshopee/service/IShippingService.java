package com.backendshopee.service;

import java.util.List;

import com.backendshopee.entity.ShippingEntity;

public interface IShippingService {

	public void addShipping(ShippingEntity shippingentity);
	public List<ShippingEntity> allShipping();
	public ShippingEntity findById(Long id);
}
