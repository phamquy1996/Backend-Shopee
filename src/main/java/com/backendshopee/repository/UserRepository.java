package com.backendshopee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.UserEntity;
@Repository

public interface UserRepository extends JpaRepository<UserEntity, Long>{ 
	UserEntity findByName(String name);
	
//	@Query( "SELECT u.name, ur.roles FROM UserEntity u INNER JOIN user_role ur ON u.user_id = 1" )
//	List<UserEntity> getAdminList();


}