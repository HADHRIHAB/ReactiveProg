package com.progReactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progReactive.entities.Employee;
import com.progReactive.entities.EmployeeDto;
import com.progReactive.mappers.EmployeeMapper;
import com.progReactive.repo.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    // ...
    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @GetMapping("/")
    public Flux<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll()
            .map(employeeMapper::convertToDTO);
    }

    @PostMapping("/")
    public Mono<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDTO) {
        Employee employee = employeeMapper.convertToEntity(employeeDTO);
        return employeeRepository.save(employee)
            .map(employeeMapper::convertToDTO);
    }

    // ...
}
