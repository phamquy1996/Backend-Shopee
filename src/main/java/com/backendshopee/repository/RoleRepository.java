package com.backendshopee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.RoleEntity;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
	public List<RoleEntity> findByRole(String role);
}
