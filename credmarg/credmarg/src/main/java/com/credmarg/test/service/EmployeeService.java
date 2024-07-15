package com.credmarg.test.service;

import com.credmarg.test.entity.Employee;
import com.credmarg.test.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

   @Autowired
   EmployeeRepository employeeRepository;

   public List<Employee> saveEmployee(List<Employee> emp){
       return  employeeRepository.saveAll(emp);
   }

   public List<Employee> getAllEmployee(){
       return employeeRepository.findAll();
   }
 public Optional<Employee> getEmployee(String id){
       return employeeRepository.findById(id);
 }

}
