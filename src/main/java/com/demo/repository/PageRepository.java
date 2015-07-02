package com.demo.repository;

import com.demo.entity.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "page", path = "page")
public interface PageRepository extends PagingAndSortingRepository<Page, Long> {
}
