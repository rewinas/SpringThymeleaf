package com.kuraz.Thymeleaf.SpringThymeleaf.service;

import com.kuraz.Thymeleaf.SpringThymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);

}