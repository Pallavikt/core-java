package com.xworkz.customexception.policestation;

import com.xworkz.customexception.checkedexception.OfficerNotFoundException;
import com.xworkz.customexception.checkedexception.StationsNotFoundException;

public interface PoliceStation {

    boolean addOfficer(Officer officer);
    void getAllOfficer() throws OfficerNotFoundException;
    Officer getOfficerById(int id) throws OfficerNotFoundException;
    boolean updateSalaryById(double newSalary, int id);
    String[] getStationsById(int id) throws StationsNotFoundException;
}
