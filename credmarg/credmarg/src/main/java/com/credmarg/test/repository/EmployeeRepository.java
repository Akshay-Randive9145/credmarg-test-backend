package com.credmarg.test.repository;

import com.credmarg.test.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

    public interface EmployeeRepository extends JpaRepository<Employee, String>{

    }

