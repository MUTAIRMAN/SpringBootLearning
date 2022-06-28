package com.example.springbootbackend.repository;

import com.example.springbootbackend.entity.EmployeeDemograph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDemoGraphRepository extends JpaRepository<EmployeeDemograph,Long> {

}
