package com.backendshopee.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.CategoryEntity;
import com.backendshopee.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
	
	 @Query("select s from ProductEntity s where s.categoryentity = :category ")
	 List<ProductEntity> findByCategory(@Param("category") CategoryEntity category,
	                                 Pageable pageable);
	 
	  @Query("select count(p) from ProductEntity p where p.categoryentity = :category")
	  long  totalProductByCategory(@Param("category") CategoryEntity category);
}
