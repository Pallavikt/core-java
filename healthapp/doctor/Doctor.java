package com.xworkz.healthapp.doctor;

import java.util.Arrays;

public class Doctor {

    private int doctorId;
    private String doctorName;
    private String designation;
    private String[] specialization;
    private String experience;
    private int fees;

    public int getDoctorId(){
        return doctorId;
    }
    public void setDoctorId(int doctorId){
        this.doctorId= doctorId;
    }

    public String getDoctorName(){
        return doctorName;
    }
    public void setDoctorName(String doctorName){
        this.doctorName = doctorName;
    }

    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }

    public String[] getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String[] specialization){
        this.specialization = specialization;
    }

    public String getExperience(){
        return  experience;
    }
    public void setExperience(String experience){
        this.experience = experience;
    }

    public int getFees(){
        return fees;
    }
    public void setFees(int fees){
         this.fees = fees;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", designation='" + designation + '\'' +
                ", specialization=" + Arrays.toString(specialization) +
                ", experience='" + experience + '\'' +
                ", fees=" + fees +
                '}';
    }
}
