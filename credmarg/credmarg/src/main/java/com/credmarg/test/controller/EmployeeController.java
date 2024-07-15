package com.credmarg.test.controller;

import com.credmarg.test.entity.Employee;
import com.credmarg.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("/add")
    public ResponseEntity<List<Employee>> makeEmployees(@RequestBody List<Employee> emp){
        List<Employee> empl = employeeService.saveEmployee(emp);
        return new ResponseEntity<>(empl, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public List<Employee> getAllEmp(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/emp/{email}")
    public Optional<Employee> findTheEmployee(@PathVariable String email){
        return employeeService.getEmployee(email);


    }


}
