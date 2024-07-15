package com.credmarg.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Employee {
@Id
    private String email;
    private String name;
    private String designation;
    private double ctc;



}
