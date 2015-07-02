package com.demo.repository;

import com.demo.entity.Module;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "module", path = "module")
public interface ModuleRepository extends PagingAndSortingRepository<Module, Long> {
}
