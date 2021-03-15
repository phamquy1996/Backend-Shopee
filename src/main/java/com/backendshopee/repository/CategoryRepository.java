package com.backendshopee.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backendshopee.dto.ProductDTO;
import com.backendshopee.entity.CategoryEntity;

@Repository

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
   Optional<CategoryEntity> findByName(String name);
   
   @Query("select ProductEntity from CategoryEntity p inner join p.Products ProductEntity where p = :category")
   public List<ProductDTO> findByPr(@Param("category") CategoryEntity category, Pageable pageable);
}
