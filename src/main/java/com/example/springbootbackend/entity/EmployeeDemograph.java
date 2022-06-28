package com.example.springbootbackend.entity;


import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Data
@Entity
public class EmployeeDemograph {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long eid;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @OneToOne(fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL,
    mappedBy = "EmployeeDemograph")
    private Employee eid_demoId;
}
