package com.example.springbootbackend.service.impl;

import com.example.springbootbackend.entity.EmployeeDemography;
import com.example.springbootbackend.exception.ResourceNotFoundException;
import com.example.springbootbackend.repository.EmployeeDemoGraphRepository;
import com.example.springbootbackend.service.EmployeeDemoGraph;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeDemoGraphImplementationService implements EmployeeDemoGraph {
    EmployeeDemoGraphRepository employeeDemoGraphRepository;

    public EmployeeDemoGraphImplementationService(EmployeeDemoGraphRepository employeeDemoGraphRepository){
        this.employeeDemoGraphRepository=employeeDemoGraphRepository;
    }

    @Override
    public EmployeeDemography saveEmployeeDemoGraph(EmployeeDemography employeeDemography) {
        return employeeDemoGraphRepository.save(employeeDemography);
    }

    @Override
    public EmployeeDemography getEmployeeDemoGraph(long id) {
        Optional<EmployeeDemography> empDemo= employeeDemoGraphRepository.findById(id);
        return empDemo.orElseThrow(()->new ResourceNotFoundException((id)));
    }
}
