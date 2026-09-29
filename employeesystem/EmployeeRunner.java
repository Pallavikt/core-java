package com.xworkz.employeesystem;

import com.xworkz.employeesystem.employee.Employee;

public class EmployeeRunner {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.employeeId = 501;
        employee.name = "Pallavi";
        employee.salary = 45000;
        employee.department = "IT";
        employee.designation = "Analyst";


        Employee employee1 = new Employee();

        employee1.employeeId = 501;
        employee1.name = "Pallavi";
        employee1.salary = 100000;
        employee1.department = "IT";
        employee1.designation = "developer";


        boolean isEqual = employee.equals(employee1);

        System.out.println("Values in employee and employee1 are same: "+isEqual);
    }
}