package com.example.springbootbackend.controller;

import com.example.springbootbackend.entity.EmployeeDemography;
import com.example.springbootbackend.service.impl.EmployeeDemoGraphImplementationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeDemoGraphController {

    EmployeeDemoGraphImplementationService employeeDemoGraphImplementation;

    public EmployeeDemoGraphController(EmployeeDemoGraphImplementationService employeeDemoGraphImplementationService){
        this.employeeDemoGraphImplementation=employeeDemoGraphImplementationService;
    }


    @PostMapping("/demographic")
    public ResponseEntity<EmployeeDemography> saveEmployeeDemoGraph(@RequestBody EmployeeDemography employeeDemography){
        return new ResponseEntity<EmployeeDemography>(employeeDemoGraphImplementation.saveEmployeeDemoGraph(employeeDemography), HttpStatus.CREATED);
    }

    @GetMapping("/demographic/{id}")
    public ResponseEntity<EmployeeDemography> getEmployeeDemo(@PathVariable long id){
        return new ResponseEntity<EmployeeDemography>(employeeDemoGraphImplementation.getEmployeeDemoGraph(id),HttpStatus.OK);
    }


}
