package com.backendshopee.repository;

import java.util.Optional;

import com.backendshopee.entity.CategoryEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
   Optional<CategoryEntity> findByName(String name);
}
