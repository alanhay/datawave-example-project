package org.test.data.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.model.Department;

@RepositoryRestResource
public interface DepartmentRepository
		extends PagingAndSortingRepository<Department, Long>, QuerydslPredicateExecutor<Department> {

}
