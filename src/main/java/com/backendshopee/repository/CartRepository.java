package com.backendshopee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backendshopee.entity.CartEntity;
import com.backendshopee.entity.UserEntity;

public interface CartRepository extends JpaRepository<CartEntity, Long>{
	@Query("select s from CartEntity s where s.user_buyer = :user_buyer and s.user = :user")
    List<CartEntity> findByUseridbuyerAndUseridsaler(@Param("user_buyer") UserEntity user_buyer,
	                                 @Param("user") UserEntity user);
}
