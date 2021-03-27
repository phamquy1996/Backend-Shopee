package com.backendshopee.api.client.output;

import java.util.ArrayList;
import java.util.List;

import com.backendshopee.dto.DistrictDTO;
import com.backendshopee.dto.ProvinceDTO;
import com.backendshopee.dto.WardDTO;

public class AddressAccount {
	List<ProvinceDTO> provinces = new ArrayList<>();
	List<DistrictDTO> districts = new ArrayList<>();
	List<WardDTO> wards = new ArrayList<>();
	public List<ProvinceDTO> getProvinces() {
		return provinces;
	}
	public void setProvinces(List<ProvinceDTO> provinces) {
		this.provinces = provinces;
	}
	public List<DistrictDTO> getDistricts() {
		return districts;
	}
	public void setDistricts(List<DistrictDTO> districts) {
		this.districts = districts;
	}
	public List<WardDTO> getWards() {
		return wards;
	}
	public void setWards(List<WardDTO> wards) {
		this.wards = wards;
	}
}
