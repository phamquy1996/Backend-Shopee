package com.backendshopee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.RoomChatEntity;

@Repository
public interface RoomChatRepository extends JpaRepository<RoomChatEntity, Long> {
	@Query("select s from RoomChatEntity s where s.UserName1 = :UserName1 and s.UserName2 = :UserName2")
    List<RoomChatEntity> findByUserName1AndUserName2(@Param("UserName1") String UserName1,
	                                 @Param("UserName2") String UserName2);
	
	@Query("select s from RoomChatEntity s where s.UserName2 = :UserName2")
    List<RoomChatEntity> findByUserName1(@Param("UserName2") String UserName2);
}
