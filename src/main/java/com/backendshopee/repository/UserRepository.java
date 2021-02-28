package com.backendshopee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.UserEntity;
import java.util.Optional;
@Repository

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	UserEntity findByName(String name);
}