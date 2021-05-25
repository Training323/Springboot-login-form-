package com.employee.EmployeeLogin.Repository;

import com.employee.EmployeeLogin.Model.Employee;

import java.util.List;

public interface IEmployeeRepo {
    List<Employee> getEmployeeDetailsFromDB();

}
