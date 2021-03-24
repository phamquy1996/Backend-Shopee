package com.backendshopee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.DistrictEntity;

@Repository
public interface DistrictRepository extends JpaRepository<DistrictEntity, Long> {
	@Query("select s from DistrictEntity s where s.province_id = :id")
	public List<DistrictEntity> findByProvinceId(@Param("id") Integer id);
}
