package com.backendshopee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.AddressEntity;
import com.backendshopee.entity.UserEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long>{
	@Query("select s from AddressEntity s where s.user = :user_id")
	public List<AddressEntity> findAllAddress(@Param("user_id") UserEntity userEntity);
}
