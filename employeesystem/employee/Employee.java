package com.xworkz.employeesystem.employee;

public class Employee {

    public int employeeId;
    public String name;
    public double salary;
    public String department;
    public String designation;

    @Override
    public boolean equals(Object object) {

        Employee employee;
        employee = (Employee) object;

        if (this.employeeId == employee.employeeId &&
                this.name.equals(employee.name) &&
                this.salary == employee.salary &&
                this.department.equals(employee.department) &&
                this.designation.equals(employee.designation)) {

            return true;
        }

        return false;
    }
}