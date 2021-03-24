package com.backendshopee.service;

import java.util.List;

import com.backendshopee.dto.WardDTO;

public interface IWardService {
	public List<WardDTO> findAll(int id);
}
