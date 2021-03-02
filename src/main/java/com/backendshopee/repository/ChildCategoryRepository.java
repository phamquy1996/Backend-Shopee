package com.backendshopee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.ChildCategoryEntity;

@Repository
public interface ChildCategoryRepository extends JpaRepository<ChildCategoryEntity, Long> {

}
