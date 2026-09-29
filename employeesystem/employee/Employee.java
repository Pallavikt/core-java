package com.xworkz.employeesystem.employee;

public class Employee {

    // private → data hiding; fields cannot be accessed directly outside the class
    private int employeeId;
    private String name;
    private double salary;
    private String department;
    private String designation;


    // Getter → used to read/access the private field value
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter → used to set/update the private field value
    public void setEmployeeId(int employeeId) {
        // this.employeeId → instance variable, employeeId → parameter
        this.employeeId = employeeId;
    }


    // Getter → returns the employee name
    public String getName() {
        return name;
    }

    // Setter → assigns the name to the current object
    public void setName(String name) {
        this.name = name;
    }


    // Getter → returns the employee salary
    public double getSalary() {
        return salary;
    }

    // Setter → assigns the salary to the current object
    public void setSalary(double salary) {
        this.salary = salary;
    }


    // Getter → returns the employee department
    public String getDepartment() {
        return department;
    }

    // Setter → assigns the department to the current object
    public void setDepartment(String department) {
        this.department = department;
    }


    // Getter → returns the employee designation
    public String getDesignation() {
        return designation;
    }

    // Setter → assigns the designation to the current object
    public void setDesignation(String designation) {
        this.designation = designation;
    }
}