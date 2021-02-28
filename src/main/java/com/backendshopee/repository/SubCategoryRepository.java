package com.backendshopee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.SubCategoryEntity;
import com.backendshopee.entity.UserEntity;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategoryEntity, Long>{
	Optional<SubCategoryEntity> findById(Long id);
}
