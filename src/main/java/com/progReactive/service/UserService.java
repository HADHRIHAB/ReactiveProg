package com.progReactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progReactive.entities.Employee;
import com.progReactive.repo.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class UserService {
	@Autowired
	EmployeeRepository employeeRepository;
	public Flux<Employee> getUsers()
	{
		return employeeRepository.findAll();
	}
	public Mono<Employee> saveOne(Employee employee)
	{
		return employeeRepository.save(employee);
	}

}
