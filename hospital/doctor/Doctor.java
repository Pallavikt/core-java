package com.xworkz.hospital.doctor;

import java.util.Arrays;

public class Doctor {

    public int doctorId;
    public String doctorName;
    public String designation;
    public String[] specialization;
    public String experience;
    public int fees;

    // 2. Added a Parameterized Constructor to initialize all values at runtime
    public Doctor(int doctorId, String doctorName, String designation, String[] specialization, String experience, int fees) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.designation = designation;
        this.specialization = specialization;
        this.experience = experience;
        this.fees = fees;
    }

    public Doctor() {

    }

    public void specialization(String[] specializations) {
        this.specialization = specializations;
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


    public int getDoctorId() {

        return doctorId;
    }


    public int getFees() {
        return fees;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorFees(int newFees) {
        this.fees = newFees;
    }

    public void setExperience(String newExperience) {
        this.experience = newExperience;
    }
}
