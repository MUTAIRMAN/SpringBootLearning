package com.example.springbootbackend.service;

import com.example.springbootbackend.entity.Employee;
import com.example.springbootbackend.entity.EmployeeDemograph;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(long id);
    Employee patchEmployeeEmailId(long id ,Employee employee);
    void deleteEmployee(long id);
}

