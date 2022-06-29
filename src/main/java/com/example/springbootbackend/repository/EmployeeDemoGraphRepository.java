package com.example.springbootbackend.repository;

import com.example.springbootbackend.entity.EmployeeDemography;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDemoGraphRepository extends JpaRepository<EmployeeDemography,Long> {

}
