package com.backendshopee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.ShippingEntity;

@Repository
public interface ShippingRepository extends JpaRepository<ShippingEntity, Long> {

}
