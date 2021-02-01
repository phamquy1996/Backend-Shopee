package com.backendshopee.service;

import java.util.List;

import com.backendshopee.entity.RoleEntity;

public interface IRoleService {
	public void addRole(RoleEntity roleEntity);
	public List<RoleEntity> findByRole(String role);
}
