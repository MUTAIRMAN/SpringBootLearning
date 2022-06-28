package com.example.springbootbackend.controller;


import com.example.springbootbackend.entity.Employee;
import com.example.springbootbackend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {
    EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @PostMapping("/employeeCreate")
    public ResponseEntity<Employee> saveEmployee(@RequestBody  Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping("/getEmployees")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(),HttpStatus.OK);
    }

    @GetMapping("/getEmployee")
    public ResponseEntity<Employee> getParticularEmployee(@RequestParam Long id){
        return new ResponseEntity<Employee>(employeeService.getEmployee(id),HttpStatus.OK);
    }

    @PatchMapping("/ModifyEmployeeEmailId")
    public ResponseEntity<Employee> updateEmailid(@RequestParam long id,@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.patchEmployeeEmailId(id,employee),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/DeleteEmployee/{id}")
    public ResponseEntity deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
