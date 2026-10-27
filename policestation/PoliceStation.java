package com.xworkz.policestation;

import com.xworkz.policestation.officer.Officer;

public interface PoliceStation {

    boolean addOfficer(Officer officer);
    void getAllOfficer();
    Officer getOfficerById(int id);
    boolean updateSalaryById(double newSalary, int id);
}
