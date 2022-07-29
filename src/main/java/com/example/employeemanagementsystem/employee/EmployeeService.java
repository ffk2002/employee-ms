package com.example.employeemanagementsystem.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repo;

    @Autowired
    public EmployeeService(EmployeeRepository repo){
        this.repo = repo;
    }

    public List<Employee> getAllEmployees(){
        return repo.findAll();
    }
}
