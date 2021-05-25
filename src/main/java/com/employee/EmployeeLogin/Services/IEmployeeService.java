package com.employee.EmployeeLogin.Services;

import com.employee.EmployeeLogin.Model.Employee;


import java.util.List;


import org.springframework.stereotype.Service;

import java.util.List;



public interface IEmployeeService {

    public List<Employee> getEmployeeDetails();

    public List<Employee>  validate(String username, String password);
}
