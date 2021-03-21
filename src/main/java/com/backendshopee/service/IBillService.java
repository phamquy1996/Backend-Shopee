package com.backendshopee.service;

import com.backendshopee.entity.BillEntity;

public interface IBillService {
	public void checkout();
	public BillEntity findById(Long id);
}
