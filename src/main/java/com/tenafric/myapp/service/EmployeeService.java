package com.tenafric.myapp.service;


import java.util.List;

import com.tenafric.myapp.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(EmployeeDto employeeDto);

    void deleteEmployee(Long employeeId);
}
