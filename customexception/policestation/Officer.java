package com.xworkz.customexception.policestation;

public class Officer {

    public int id;
    public String officerName;
    public double salary;
    public String[] station;

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

    public String[] getStation() {

        return station;
    }

    public void setStation(String[] stations) {
        this.station = stations;
    }
}