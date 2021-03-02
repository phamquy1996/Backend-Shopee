package com.backendshopee.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.SubCategoryEntity;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategoryEntity, Long>{
//	 Optional<SubCategoryEntity> findById(Long id);
	
	 @Query("select s from SubCategoryEntity s where s.name = ?1")
	 SubCategoryEntity findByEmailAddress(String emailAddress);
	 
	 @Query("select s from SubCategoryEntity s where s.name like %:firstname% or s.image like  %:lastname%")
	 List<SubCategoryEntity> findByLastnameOrFirstname(@Param("lastname") String lastname,
	                                 @Param("firstname") String firstname, Pageable pageable);
}
