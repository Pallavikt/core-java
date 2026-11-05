package com.xworkz.customexception.hospital;

import java.util.Arrays;

public class Doctor {

    public int id;
    public String doctorName;
    public int fee;
    public String experience;
    public String[] specialization;
    public String designation;

    public int getId() {
        return id;
    }

    public int getFee() {
        return fee;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getExperience() {
        return experience;
    }

    public String getDesignation() {
        return designation;
    }

    public String[] getSpecialization() {
        return specialization;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSpecialization(String[] specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", doctorName='" + doctorName + '\'' +
                ", fee=" + fee +
                ", experience='" + experience + '\'' +
                ", specialization=" + Arrays.toString(specialization) +
                ", designation='" + designation + '\'' +
                '}';
    }

    public void specialization(String[] specializations) {
        this.specialization = specializations;
    }
}