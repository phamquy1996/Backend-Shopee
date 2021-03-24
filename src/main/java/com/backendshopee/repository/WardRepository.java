package com.backendshopee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.WardEntity;

@Repository
public interface WardRepository extends JpaRepository<WardEntity, Long>{
	@Query("select s from WardEntity s where s.district_id = :id")
	public List<WardEntity> findByDistrictId(@Param("id") Integer id);
}
