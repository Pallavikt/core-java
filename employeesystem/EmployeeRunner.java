package com.xworkz.employeesystem;

import com.xworkz.employeesystem.employee.Employee;

public class EmployeeRunner {

    public static void main(String[] args) {

        // Creates an Employee object using the new keyword
        Employee employee = new Employee();

        // Setter → sets the employee ID
        employee.setEmployeeId(1);
        // Getter → gets and prints the employee ID
        int employeeId = employee.getEmployeeId();
        System.out.println(employeeId);

        // Setter → sets the employee name
        employee.setName("Pallavi");
        // Getter → gets and prints the employee name
        String name = employee.getName();
        System.out.println(name);

        // Setter → sets the employee salary
        employee.setSalary(45000);
        // Getter → gets and prints the employee salary
        double salary = employee.getSalary();
        System.out.println(salary);

        // Setter → sets the employee department
        employee.setDepartment("IT");
        // Getter → gets and prints the department
        String department = employee.getDepartment();
        System.out.println(department);

        // Setter → sets the employee designation
        employee.setDesignation("Analyst");
        // Getter → gets and prints the designation
        String designation = employee.getDesignation();
        System.out.println(designation);
    }
}