package com.backendshopee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendshopee.dto.AddressDTO;
import com.backendshopee.dto.DistrictDTO;
import com.backendshopee.dto.ProvinceDTO;
import com.backendshopee.dto.WardDTO;
import com.backendshopee.service.IAddressService;
import com.backendshopee.service.IDistrictService;
import com.backendshopee.service.IProvinceService;
import com.backendshopee.service.IWardService;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

	@Autowired 
	IProvinceService iProvinceService;
	
	@Autowired 
	IDistrictService iDistrictService;
	
	@Autowired 
	IWardService iWardService;
	
	@Autowired 
	IAddressService iAddressService;
	
	@GetMapping("/allProvince")
	public List<ProvinceDTO> allProvince() {
		return iProvinceService.findAll();
	}
	
	@GetMapping("/allDistrict/{id}")
	public List<DistrictDTO> allDistrict(@PathVariable(value = "id") Integer id) {
		System.out.print("anhquy");
		return iDistrictService.findAll(id);
	}
	
	@GetMapping("/allWard/{id}")
	public List<WardDTO> allWard(@PathVariable(value = "id") Integer id) {
		return iWardService.findAll(id);
	}
	
	@PostMapping("/addAddress")
	public AddressDTO addAddress(@Valid @RequestBody AddressDTO model) {
		iAddressService.addAddress(model);
		return model;
	}
	
	@GetMapping("/allAddress")
	public List<AddressDTO> allAddress() {
		return iAddressService.allAdress();
	}
}
