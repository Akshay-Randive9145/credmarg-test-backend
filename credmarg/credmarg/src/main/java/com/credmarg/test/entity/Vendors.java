package com.credmarg.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Vendors {
@Id
    private String email;
    private String name;
    private String upi;


}
