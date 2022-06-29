package com.example.springbootbackend.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="EmployeeDemography")
public class EmployeeDemography {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="emp_demo_id")
    private long eid;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @OneToOne(mappedBy = "employeeDemography")
    private Employee employee;

}
