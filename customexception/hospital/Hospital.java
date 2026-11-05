package com.xworkz.customexception.hospital;

import com.xworkz.customexception.checkedexception.FeeNotFoundException;
import com.xworkz.customexception.checkedexception.SpecializationNotFoundException;

public interface Hospital {

    boolean addDoctor(Doctor doctor);
    int getFeeByDoctorName(String name) throws FeeNotFoundException;
    int getFeeById(int id) throws FeeNotFoundException;
    String[] getSpecializationByDoctorName(String name) throws SpecializationNotFoundException;
    String getDesignationById(int id);
    String getDesignationByName(String name);
    String getExperienceByDoctorName(String name);
    String getExperienceById(int id);
    Doctor getDoctorById(int id);
    Doctor getDoctorByFee(int fee);
    Doctor getDoctorByExperience(String experience);
    Doctor getDoctorByDesignation(String designation);
    boolean updateFeeByExperience(int newFee, String experience);
    void getAllDoctors();
}
