package com.xworkz.hospital;

import com.xworkz.hospital.doctor.Doctor;

public interface Hospital {

    public boolean addDoctor(Doctor doctor);
    public void getAllDoctors();
    Doctor getDoctorById(int id);
    boolean updateFeesByName(int newFees, String doctorName);
    boolean updateExperienceById(String newExperience, int id);
}