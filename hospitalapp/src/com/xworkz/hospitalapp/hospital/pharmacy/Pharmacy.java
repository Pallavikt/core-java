package com.xworkz.hospitalapp.hospital.pharmacy;

import com.xworkz.hospitalapp.hospital.Hospital;

public class Pharmacy extends Hospital {

    @Override
    public void admitPatient() {
        System.out.println("Pharmacy Admitting Patient");
    }

    @Override
    public void checkPatient() {
        System.out.println("Pharmacy Checking Patient");
    }

    @Override
    public void consultDoctor() {
        System.out.println("Pharmacy Consulting Doctor");
    }

    @Override
    public void provideTreatment() {
        System.out.println("Pharmacy Providing Treatment");
    }

    @Override
    public void generateBill() {
        System.out.println("Pharmacy Generating Bill");
    }

    @Override
    public void dischargePatient() {
        System.out.println("Pharmacy Discharging Patient");
    }

    @Override
    public void checkReport() {
        System.out.println("Pharmacy Checking Report");
    }

    @Override
    public void bookAppointment() {
        System.out.println("Pharmacy Booking Appointment");
    }

    @Override
    public void maintainRecords() {
        System.out.println("Pharmacy Maintaining Records");
    }
}