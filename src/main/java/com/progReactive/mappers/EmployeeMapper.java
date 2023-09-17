package com.progReactive.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.progReactive.entities.Employee;
import com.progReactive.entities.EmployeeDto;

@Component
public class EmployeeMapper {
    private final ModelMapper modelMapper;

    public EmployeeMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public EmployeeDto convertToDTO(Employee employee) {
        return modelMapper.map(employee, EmployeeDto.class);
    }

    public Employee convertToEntity(EmployeeDto employeeDTO) {
        return modelMapper.map(employeeDTO, Employee.class);
    }
    //return
    /*
     *   return employeeRepository.findAll()
            .map(employeeMapper::convertToDTO);
     */
    /*
     * Employee employee = employeeMapper.convertToEntity(employeeDTO);
        return employeeRepository.save(employee)
            .map(employeeMapper::convertToDTO);
    }
     */

	public EmployeeMapper() {
		this.modelMapper = new ModelMapper();
		// TODO Auto-generated constructor stub
	}
    
}
