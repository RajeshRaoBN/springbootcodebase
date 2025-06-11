package com.rajesh.crudprojectapp.repository;

import com.rajesh.crudprojectapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
