package com.backendshopee.service;

import java.util.List;

import com.backendshopee.dto.AddressDTO;

public interface IAddressService {
	public void addAddress(AddressDTO addressDTO);
	public List<AddressDTO> allAdress();
}
