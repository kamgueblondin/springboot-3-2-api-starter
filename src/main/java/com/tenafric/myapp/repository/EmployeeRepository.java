package com.tenafric.myapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tenafric.myapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
