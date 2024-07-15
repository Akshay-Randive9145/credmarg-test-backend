package com.credmarg.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Email {
@Id
@GeneratedValue
    private Long id;
    private String toEmail;

    private String content;


}
