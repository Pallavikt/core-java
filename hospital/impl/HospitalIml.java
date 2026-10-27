package com.xworkz.hospital.impl;

import com.xworkz.hospital.doctor.Doctor;
import com.xworkz.hospital.Hospital;

public class HospitalIml implements Hospital {

    private Doctor[] doctors;
    private int index;

    public HospitalIml(int size) {
        this.doctors = new Doctor[size];
    }

    @Override
    public boolean addDoctor(Doctor doctor) {
        boolean isAdded = false;

        boolean isDoctorIdValid = false;
        boolean isDoctorNameValid = false;
        boolean isDesignationValid = false;
        boolean isSpecializationValid = false;
        boolean isExperienceValid = false;
        boolean isfeesValid = false;

        int doctorId = doctor.doctorId;
        if (doctorId > 0) {
            isDoctorIdValid = true;
        } else {
            System.out.println("Doctor Id is Invalid");
        }

        String doctorName = doctor.doctorName;
        if (doctorName != null && !doctorName.isEmpty()) {
            isDoctorNameValid = true;
        } else {
            System.out.println("Doctor Name is Invalid");
        }

        String designation = doctor.designation;
        if (designation != null && !designation.isEmpty()) {
            isDesignationValid = true;
        }else System.out.println("Doctor Designation is Invalid!");

        String[] specialization = doctor.specialization;
        if (specialization != null) {
            isSpecializationValid = true;
        }else System.out.println("Doctor Specialization is Invalid!");

        String experience = doctor.experience;
        if (experience != null && !experience.isEmpty()) {
            isExperienceValid = true;
        }else System.out.println("Doctor Experience is Invalid!");

        int fees = doctor.fees;
        if (fees > 0) {
            isfeesValid = true;
        }else System.out.println("Doctor Fees is Invalid!");

        if (isDoctorIdValid && isDoctorNameValid && isDesignationValid && isSpecializationValid
                && isExperienceValid && isfeesValid) {
            if (index < doctors.length) {
                doctors[index++] = doctor;
                isAdded = true;
            } else {
                System.out.println("Hospital database is full! Cannot add more doctors.");
            }
        }

        return isAdded;
    }

    @Override
    public void getAllDoctors() {
        for (Doctor doctor : doctors) {
            if (doctor != null) {
                System.out.println(doctor);
            }
        }
    }

    @Override
    public Doctor getDoctorById(int id){
        System.out.println("Fetching Doctor by Id...");
        Doctor doctor = null;
            for(Doctor doctor1 : doctors){
                if(id == doctor1.getDoctorId()){
                    doctor = doctor1;
                }
            }

     return doctor;
    }

    @Override
    public boolean updateFeesByName(int newFees, String doctorName) {
        boolean isFeesUpdated = false;

        for (Doctor doctor : doctors) {
            if (doctor.getDoctorName().equals(doctorName)) {
                doctor.setDoctorFees(newFees);
                isFeesUpdated = true;
            }
        }

        return isFeesUpdated;
    }

    @Override
    public boolean updateExperienceById(String newExperience, int id) {
      boolean isExperienceUpdated = false;

      for (Doctor doctor:doctors){
          if(doctor.getDoctorId()==id){
              doctor.setExperience(newExperience);
              isExperienceUpdated = true;
          }
      }

        return isExperienceUpdated;
    }
}