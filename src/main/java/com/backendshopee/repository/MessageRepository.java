package com.backendshopee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.MessageEntity;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Long>{

}
