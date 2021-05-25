package com.employee.EmployeeLogin.Repository;

import com.employee.EmployeeLogin.Model.Employee;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository  //interats with the database
public class EmployeeRepoImpl implements IEmployeeRepo{

    @Override
    public List<Employee> getEmployeeDetailsFromDB() {
        List<Employee> employeesDetails = new ArrayList<>();

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setEmp_id(1);
        employee1.setEmp_name("Kunal");
        employee1.setEmp_dept("ADM");
        employee1.setEmp_phn_no(71290370);

        employee2.setEmp_id(2);
        employee2.setEmp_name("Anushka");
        employee2.setEmp_dept("ADM");
        employee2.setEmp_phn_no(71123470);

        employeesDetails.add(employee1);
        employeesDetails.add(employee2);
        return employeesDetails;



    }
}
