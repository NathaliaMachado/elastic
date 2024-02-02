package com.poc.elastic.elastic.repository;

import com.poc.elastic.elastic.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

//@Component
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
}
