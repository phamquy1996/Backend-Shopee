package com.backendshopee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.ClassifyEntity;

@Repository
public interface ClassifyRepository extends JpaRepository<ClassifyEntity, Long> {


}
