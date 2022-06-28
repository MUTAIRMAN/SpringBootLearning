package com.example.springbootbackend.controller;

import com.example.springbootbackend.entity.EmployeeDemograph;
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
    public ResponseEntity<EmployeeDemograph> saveEmployeeDemoGraph(@RequestBody EmployeeDemograph employeeDemograph){
        return new ResponseEntity<EmployeeDemograph>(employeeDemoGraphImplementation.saveEmployeeDemoGraph(employeeDemograph), HttpStatus.CREATED);
    }

    @GetMapping("/demographic/{id}")
    public ResponseEntity<EmployeeDemograph> getEmployeeDemo(@PathVariable long id){
        return new ResponseEntity<EmployeeDemograph>(employeeDemoGraphImplementation.getEmployeeDemoGraph(id),HttpStatus.OK);
    }


}
