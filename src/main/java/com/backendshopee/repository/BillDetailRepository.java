package com.backendshopee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.BillDetailEntiy;

@Repository
public interface BillDetailRepository extends JpaRepository<BillDetailEntiy, Long>{

}
