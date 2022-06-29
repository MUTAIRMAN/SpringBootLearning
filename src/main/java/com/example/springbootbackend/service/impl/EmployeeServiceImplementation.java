package com.example.springbootbackend.service.impl;

import com.example.springbootbackend.entity.Employee;
import com.example.springbootbackend.repository.EmployeeRepository;
import com.example.springbootbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


    public Employee getEmployee(long id){
        Optional<Employee> employee= employeeRepository.findById(id);
        return employee.get();
    }

    @Override
    public Employee patchEmployeeEmailId(long id,Employee employee) {
        Employee currentEmployeeObj=employeeRepository.findById(id).get();
        currentEmployeeObj.setEmailId(employee.getEmailId());
         return employeeRepository.save(currentEmployeeObj);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);

    }


}
