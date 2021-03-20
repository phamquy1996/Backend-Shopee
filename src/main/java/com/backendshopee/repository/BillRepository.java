package com.backendshopee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.BillEntity;

@Repository
public interface BillRepository extends JpaRepository<BillEntity, Long>{

}
