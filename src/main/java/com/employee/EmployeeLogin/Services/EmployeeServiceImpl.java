package com.employee.EmployeeLogin.Services;

import com.employee.EmployeeLogin.Model.Employee;
import com.employee.EmployeeLogin.Repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service //all the impl here (business logic)
public class EmployeeServiceImpl implements IEmployeeService{

    @Value("${a.b.username}")
    String uname;

    @Value("${a.b.password}")
    String pass;


    @Autowired
    IEmployeeRepo iEmployeeRepo;

    @Override
    public List<Employee> getEmployeeDetails() {
        List<Employee> employeeDetails = iEmployeeRepo.getEmployeeDetailsFromDB();
        System.out.println(uname);
        System.out.println(pass);
        return employeeDetails;
    }


    public List<Employee> validate(String username, String password){
        System.out.println(username);
        System.out.println(password);
        List<Employee> employeeDetails = null;
        if(uname.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password)){
            employeeDetails = iEmployeeRepo.getEmployeeDetailsFromDB();
        } else{
            //Handle scenario
        }
        return employeeDetails;

    }
}
