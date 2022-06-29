package com.example.springbootbackend.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="employee_id")
    private long id;

    @Column(name="first_name",nullable = false)
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_id")
    private String emailId;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="emp_demo_id",referencedColumnName = "emp_demo_id")
    private EmployeeDemography employeeDemography;

}
