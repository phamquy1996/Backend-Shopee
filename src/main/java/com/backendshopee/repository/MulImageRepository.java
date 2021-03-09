package com.backendshopee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.MulImageProductEntity;

@Repository
public interface MulImageRepository extends JpaRepository<MulImageProductEntity, Long>{

}
