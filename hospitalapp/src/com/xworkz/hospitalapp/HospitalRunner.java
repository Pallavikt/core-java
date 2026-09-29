package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.pharmacy.Pharmacy;

public class HospitalRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Hospital hospital = new Hospital();

        hospital.admitPatient();
        hospital.checkPatient();
        hospital.consultDoctor();
        hospital.provideTreatment();
        hospital.generateBill();


        Hospital hospital1 = new Pharmacy();

        hospital1.admitPatient();
        hospital1.checkPatient();
        hospital1.consultDoctor();
        hospital1.provideTreatment();
        hospital1.generateBill();


        Pharmacy pharmacy = new Pharmacy();

        pharmacy.admitPatient();
        pharmacy.checkPatient();
        pharmacy.consultDoctor();
        pharmacy.provideTreatment();
        pharmacy.generateBill();

        System.out.println("Main Ended");
    }
}