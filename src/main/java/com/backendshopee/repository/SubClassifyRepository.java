package com.backendshopee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.SubClassifyEntity;

@Repository
public interface SubClassifyRepository extends JpaRepository<SubClassifyEntity, Long>{

}
