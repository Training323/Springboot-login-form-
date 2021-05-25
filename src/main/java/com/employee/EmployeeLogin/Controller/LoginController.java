package com.employee.EmployeeLogin.Controller;

import com.employee.EmployeeLogin.Model.Employee;
import com.employee.EmployeeLogin.Model.User;
import com.employee.EmployeeLogin.Services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller  //no basic implementation in controller
public class LoginController {

    @Autowired
    IEmployeeService iEmployeeService;

    @RequestMapping("/")
        public String employeeLogin(User user){
        return "login";
    }

    @RequestMapping(path="/get", method = RequestMethod.POST)
    @ResponseBody
    public  List<Employee> getUserDetails(@RequestParam("username") String username, @RequestParam("password") String password){
        List<Employee> employeeDetails = iEmployeeService.validate(username, password);
        for(Employee employee : employeeDetails){
            System.out.println("Here");
        }
        return employeeDetails;
    }


}
