package com.xworkz.hospital;

import com.xworkz.hospital.doctor.Doctor;
import com.xworkz.hospital.impl.HospitalIml;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        scanner.nextLine();

        Hospital hospital = new HospitalIml(size);

        for(int i=0;i<size;i++){
            Doctor doctor = new Doctor();
            System.out.println("Enter Doctor ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            doctor.doctorId = id;

            System.out.println("Enter Specializations: ");
            String specialization = scanner.nextLine();
            String[] specializations = specialization.split( "," );
            doctor.specialization(specializations);

            System.out.println("Enter Doctor Name: ");
            String doctorName = scanner.nextLine();
            doctor.doctorName = doctorName;

            System.out.println("Enter Doctor FEE: ");
            int doctorFee = scanner.nextInt();
            scanner.nextLine();
            doctor.fees = doctorFee;

            System.out.println("Enter the Designation of the Doctor: ");
            String designation = scanner.nextLine();
            doctor.designation = designation;

            System.out.println("Enter the Experience of Doctor: ");
            String experience = scanner.nextLine();
            doctor.experience = experience;

            System.out.println("Doctor Added...");
            hospital.addDoctor(doctor);
        }

        String yesOrNo;
        do {
            System.out.println("Press 1 to display all the Doctors");
            System.out.println("Press 2 to display a Doctor based on Id");
            System.out.println("Press 3 to Update Fees based on Name");
            System.out.println("Press 4 to update Experience based on ID");

            int options = scanner.nextInt();
            scanner.nextLine();
            switch (options) {

                case 1:
                    System.out.println("Get all Doctors");
                    hospital.getAllDoctors();
                    break;

                case 2:
                    System.out.println("Get Doctor by id");
                    Doctor doctor1 = hospital.getDoctorById(1);
                    System.out.println(doctor1);
                    break;

                case 3:
                    System.out.println("updating fees by name...");
                    boolean updateFees = hospital.updateFeesByName(190, "aa");
                    System.out.println(updateFees);
                    break;

                case 4:
                    System.out.println("updating Experience by id...");
                    boolean updateExperience = hospital.updateExperienceById("30 Yearse", 2);
                    System.out.println(updateExperience);
                    break;

                default:
                    System.out.println("Please Enter the valid Option..!");
            }
            System.out.println("Do you want to continue? Enter Y or N:");
            yesOrNo = scanner.nextLine();

        }
        while (yesOrNo.equalsIgnoreCase("Y"));
        System.out.println("Thank You for Using..");
    }
}
