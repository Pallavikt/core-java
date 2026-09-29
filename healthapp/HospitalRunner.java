package com.xworkz.healthapp;

import com.xworkz.healthapp.doctor.Doctor;
import com.xworkz.healthapp.hospital.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        String[] anoopSpecialization = {"Diabetology","Endocrinology"};
        Doctor doctor = new Doctor();
        doctor.setDoctorId(1);
        doctor.setDoctorName("Dr. Anoop Misra");
        doctor.setDesignation("Executive Chairman Fortis C Doc | Fortis C-Doc");
        doctor.setSpecialization(anoopSpecialization);
        doctor.setExperience("40 Years");
        doctor.setFees(3000);


        String[] amitSpecialization = {"General Surgery","Bariatric Surgery","Robotic Surgery"
        ,"General Surgery ","Oncology"};
        Doctor doctor1 = new Doctor();
        doctor1.setDoctorId(2);
        doctor1.setDoctorName("Dr. (Prof.) Amit Javed");
        doctor1.setDesignation("Principal Director & HOD Lap GI, GI Onco, Bariatric & MIS Surgery | FMRI Gurgaon");
        doctor1.setSpecialization(amitSpecialization);
        doctor1.setExperience("25 Years");
        doctor1.setFees(1500);


        String[] ManjinderSpecialization = {"Cardiac Sciences","Interventional Cardiology"};
        Doctor doctor2 = new Doctor();
        doctor2.setDoctorId(3);
        doctor2.setDoctorName("Dr. (Col) Manjinder Sandhu");
        doctor2.setDesignation("Principal Director Cardiology | FMRI Gurgaon");
        doctor2.setSpecialization(ManjinderSpecialization);
        doctor2.setExperience("35 Years");
        doctor2.setFees(2000);

        String[] ajaySpecialization = {"Support Specialties","Internal Medicine"};
        Doctor doctor3 = new Doctor();
        doctor3.setDoctorId(4);
        doctor3.setDoctorName("Dr. Ajay Agarwal");
        doctor3.setDesignation("Chairman - Internal Medicine | Fortis Noida");
        doctor3.setSpecialization(ajaySpecialization);
        doctor3.setExperience("25 Years");
        doctor3.setFees(1400);

        String[] ajayKaulSpecialization = {"Cardiac Sciences","Vascular Surgery","Paediatric CTVS",
        "Adult CTVS","Heart Transplant"};
        Doctor doctor4 = new Doctor();
        doctor4.setDoctorId(5);
        doctor4.setDoctorName("Dr. Ajay Kaul");
        doctor4.setDesignation("Chairman Cardiac Science | Fortis Noida");
        doctor4.setSpecialization(ajayKaulSpecialization);
        doctor4.setExperience("40 Years");
        doctor4.setFees(1600);

        hospital.addDoctor(doctor);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);
        hospital.addDoctor(doctor4);
        hospital.getAllDoctors();
    }
}
