package com.example.springbootbackend.service;

import com.example.springbootbackend.entity.EmployeeDemography;

public interface EmployeeDemoGraph {
    EmployeeDemography saveEmployeeDemoGraph(EmployeeDemography employeeDemography);

    EmployeeDemography getEmployeeDemoGraph(long id);

}
