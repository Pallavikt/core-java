package com.xworkz.referencecasting;

import com.xworkz.referencecasting.developer.Developer;
import com.xworkz.referencecasting.employee.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {

        // Implicit/Upcasting
        Employee employee = new Developer();

        System.out.println("Upcasting/Implicit reference casting....");
        employee.work();

        System.out.println("          ");

        // Explicit/Downcasting
        Developer developer = (Developer) employee;

        System.out.println("Downcasting/Explicit reference casting....");
        developer.work();
        developer.writeCode();
    }
}
