package com.employee.EmployeeLogin.Model;

public class Employee {

    private int emp_id;
    private String emp_name;
    private String emp_dept;
    private int emp_phn_no;

    public Employee(int emp_id, String emp_name, String emp_dept, int emp_phn_no) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_dept = emp_dept;
        this.emp_phn_no = emp_phn_no;
    }

    public Employee() {
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_dept() {
        return emp_dept;
    }

    public void setEmp_dept(String emp_dept) {
        this.emp_dept = emp_dept;
    }

    public int getEmp_phn_no() {
        return emp_phn_no;
    }

    public void setEmp_phn_no(int emp_phn_no) {
        this.emp_phn_no = emp_phn_no;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_dept='" + emp_dept + '\'' +
                ", emp_phn_no=" + emp_phn_no +
                '}';
    }
}
