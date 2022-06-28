package com.example.springbootbackend.service;

import com.example.springbootbackend.entity.EmployeeDemograph;

public interface EmployeeDemoGraph {
    EmployeeDemograph saveEmployeeDemoGraph(EmployeeDemograph employeeDemograph);

    EmployeeDemograph getEmployeeDemoGraph(long id);

}
