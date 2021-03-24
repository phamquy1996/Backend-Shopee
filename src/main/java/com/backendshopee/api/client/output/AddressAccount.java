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
}
