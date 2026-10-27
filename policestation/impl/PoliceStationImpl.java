package com.xworkz.policestation.impl;

import com.xworkz.policestation.PoliceStation;
import com.xworkz.policestation.officer.Officer;

public class PoliceStationImpl implements PoliceStation {

    private Officer[] officers;
    public int index;

    public PoliceStationImpl(int size){
        this.officers = new Officer[size];
    }

    @Override
    public boolean addOfficer(Officer officer) {
        boolean isAdded = false;
        boolean isIdValid = false;
        boolean isNameValid = false;
        boolean isSalaryValid = false;

       int id = officer.id;
        if(id > 0){
            isIdValid = true;
        }else System.out.println("ID is Invalid");

        String name = officer.officerName;
        if (name!=null && !name.isEmpty()){
            isNameValid = true;
        }else System.out.println("Name is Invalid");

        double salary = officer.salary;
        if (salary>0){
            isSalaryValid = true;
        }else System.out.println("Salary is invalid");

        if (isIdValid&&isNameValid&&isSalaryValid){
            if (index < officers.length){
                officers[index++] = officer;
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public void getAllOfficer() {
        for (Officer officer: officers){
            if(officer != null){
                System.out.println(officer);
            }
        }
    }

    @Override
    public Officer getOfficerById(int id) {
        Officer officer = null;
        for (Officer officer1: officers){
            if (id == officer1.getId()){
                officer = officer1;
            }
        }
        return officer;
    }

    @Override
    public boolean updateSalaryById(double newSalary, int id) {
        boolean isUpdated = false;
        for (Officer officer : officers){
            if (id == officer.id){
                officer.setSalary(newSalary);
                isUpdated = true;
            }
        }
        return isUpdated;
    }
}
