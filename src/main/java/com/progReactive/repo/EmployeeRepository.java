package com.progReactive.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.progReactive.entities.Employee;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Long> {

}
