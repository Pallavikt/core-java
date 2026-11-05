package com.xworkz.customexception.policestation;

import com.xworkz.customexception.checkedexception.OfficerNotFoundException;
import com.xworkz.customexception.checkedexception.StationsNotFoundException;

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
        boolean isStationValid = false;

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

        String[] station = officer.station;
        if (station != null){
            isStationValid = true;
        }else System.out.println("stations are not valid");

        if (isIdValid&&isNameValid&&isSalaryValid&& isStationValid){
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
    public Officer getOfficerById(int id) throws OfficerNotFoundException{
        Officer officer = null;
        for (Officer officer1: officers){
            if (officer1 != null && id == officer1.getId()){
                officer = officer1;
            }
        }
        if (officer == null){
            OfficerNotFoundException exception = new OfficerNotFoundException("Sorry.. officer not found");
            throw exception;
        }
        return officer;
    }

    @Override
    public boolean updateSalaryById(double newSalary, int id) {
        boolean isUpdated = false;
        for (Officer officer : officers){
            if (officer!= null && id == officer.id){
                officer.setSalary(newSalary);
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    @Override
    public String[] getStationsById(int id) throws StationsNotFoundException{
        String[] station = null;

        for (Officer officer: officers){
            if (officer!= null && id == officer.id){
                station = officer.getStation();
            }
        }
        if (station == null){
            StationsNotFoundException exception = new StationsNotFoundException("Sorry.. station not found");
            throw exception;
        }
        return station;
    }
}
