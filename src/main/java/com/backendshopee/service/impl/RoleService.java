package com.backendshopee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.RoleEntity;
import com.backendshopee.repository.RoleRepository;
import com.backendshopee.service.IRoleService;

@Service
public class RoleService implements IRoleService{

	@Autowired
	RoleRepository rolerepository;
	@Override
	public void addRole(RoleEntity roleEntity) {
		// TODO Auto-generated method stub
		rolerepository.save(roleEntity);
	}
	@Override
	public List<RoleEntity> findByRole(String role) {
		// TODO Auto-generated method stub
		return rolerepository.findByRole(role);
	}
	
	
}
