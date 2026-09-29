package com.xworkz.healthapp.hospital;

import com.xworkz.healthapp.doctor.Doctor;

public class Hospital {

    private Doctor[] doctors = new Doctor[5];
    int index;

    public boolean addDoctor(Doctor doctor){
        boolean isAdded = false;

        boolean isDoctorIdValid = false;
        boolean isDoctorNameValid = false;
        boolean isDesignationValid = false;
        boolean isSpecializationValid = false;
        boolean isExperienceValid = false;
        boolean isfeesValid = false;

        int doctorId = doctor.getDoctorId();
        if(doctorId > 0){
            isDoctorIdValid = true;
        }else System.out.println("Doctor Id is Invalid");

        String doctorName = doctor.getDoctorName();
        if(doctorName != null && !doctorName.isEmpty()){
            isDoctorNameValid = true;
        }else System.out.println("Doctor Name is Invalid");

        String designation = doctor.getDesignation();
        if(designation!= null && !designation.isEmpty()){
            isDesignationValid = true;
        }

        String[] specialization = doctor.getSpecialization();
        if(specialization!=null){
            isSpecializationValid = true;
        }

        String experience = doctor.getExperience();
        if(experience != null&& !experience.isEmpty() ){
            isExperienceValid = true;
        }

        int fees = doctor.getFees();
            if(fees > 0){
                isfeesValid = true;
            }

        if(isDoctorIdValid && isDoctorNameValid && isDesignationValid && isSpecializationValid
        && isExperienceValid && isfeesValid){
            doctors[index++] = doctor;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllDoctors(){
        for(Doctor doctor:doctors){
            System.out.println(doctor);
        }
    }
}
