package com.backendshopee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.CartDetailEntity;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetailEntity, Long> {

}
