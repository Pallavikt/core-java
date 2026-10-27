package com.xworkz.policestation.officer;

public class Officer {

    public int id;
    public String officerName;
    public double salary;

    @Override
    public String toString() {
        return "Officer{" +
                "id=" + id +
                ", officerName='" + officerName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public int getId() {

        return id;
    }
}