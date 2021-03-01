package com.backendshopee.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.backendshopee.entity.SubCategoryEntity;

@Repository
public interface PaginateRepository extends PagingAndSortingRepository<SubCategoryEntity, Long>{

}
