package com.backendshopee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.backendshopee.dto.AddressDTO;
import com.backendshopee.entity.AddressEntity;
import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.AddressRepository;
import com.backendshopee.service.IAddressService;
import com.backendshopee.service.IUserService;

@Service
public class AddressService implements IAddressService{
	
	@Autowired 
	AddressRepository addressRepository;
	
	@Autowired 
	IUserService iUserService;
	
	@Override
	public void addAddress(AddressDTO addressDTO) {
		// TODO Auto-generated method stub
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if (principal instanceof UserDetails) {
		 username = ((UserDetails)principal).getUsername();
		} else {
		 username = principal.toString();
		}
		UserEntity user = iUserService.findByName(username);
		AddressEntity address = new AddressEntity();
		address.setDistrict_id(addressDTO.getDistrict_id());
		address.setProvince_id(addressDTO.getProvince_id());
		address.setWard_id(addressDTO.getWard_id());
		address.setUser(user);
		address.setPhone(addressDTO.getPhone());
		address.setProvince_id(addressDTO.getProvince_id());
		address.setVillage(addressDTO.getVillage());
		addressRepository.save(address);
	}

	@Override
	public List<AddressDTO> allAdress() {
		// TODO Auto-generated method stub
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if (principal instanceof UserDetails) {
		 username = ((UserDetails)principal).getUsername();
		} else {
		 username = principal.toString();
		}
		UserEntity user = iUserService.findByName(username);
	
		List<AddressEntity> addresssEntity = addressRepository.findAllAddress(user);
		List<AddressDTO> addresss = new ArrayList<>();
		for(AddressEntity item:addresssEntity) {
			AddressDTO address = new AddressDTO();
			address.setProvince_id(item.getProvince_id());
			address.setVillage(item.getVillage());
			address.setDistrict_id(item.getDistrict_id());
			address.setWard_id(item.getWard_id());
			address.setProvince_id(item.getProvince_id());
			address.setPhone(item.getPhone());
			address.setName(item.getName());
			address.setUser_id(user.getId());
			addresss.add(address);
		}
		return addresss;
	}

}
