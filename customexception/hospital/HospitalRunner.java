package com.xworkz.customexception.hospital;

import com.xworkz.customexception.checkedexception.FeeNotFoundException;
import com.xworkz.customexception.checkedexception.SpecializationNotFoundException;

import java.util.Scanner;

public class HospitalRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter size of doctors:");
            int size = scanner.nextInt();

            Hospital hospital = new HospitalImpl(size);
            for (int i = 0; i < size; i++) {
                Doctor doctor = new Doctor();
                System.out.println("Enter the id:");
                int id = scanner.nextInt();
                scanner.nextLine();
                doctor.id = id;

                System.out.println("Enter name:");
                String dName = scanner.nextLine();
                doctor.doctorName = dName;

                System.out.println("Enter fee:");
                int fee = scanner.nextInt();
                scanner.nextLine();
                doctor.fee = fee;

                System.out.println("Enter Experience:");
                String dExperience = scanner.nextLine();
                doctor.experience = dExperience;

                System.out.println("Enter the designation:");
                String dDesignation = scanner.nextLine();
                doctor.designation = dDesignation;

                System.out.println("Enter the Specialization:");
                String specialization = scanner.nextLine();
                String[] specializations = specialization.split(",");
                doctor.setSpecialization(specializations);

                hospital.addDoctor(doctor);
            }

            String yesOrNo;
            do {
                System.out.println("Press 1 to get doctor based on id");
                System.out.println("Press 2 to get doctor based on fees");
                System.out.println("Press 3 to get doctor based on experience");
                System.out.println("Press 4 to get doctor based on designation");
                System.out.println("Press 5 to get experience based on id");
                System.out.println("Press 6 to get experience based on name");
                System.out.println("Press 7 to get designation based on id");
                System.out.println("Press 8 to get designation based on name");
                System.out.println("Press 9 to get fees based on id");
                System.out.println("Press 10 to get fees based on name");
                System.out.println("Press 11 to get specialization based on name");
                System.out.println("Press 12 to update fee based on experience");
                System.out.println("Press 13 to get all doctors");

                System.out.println("Enter the option:");
                int option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Fetching doctor based on Id...");
                        System.out.println("Enter the id from which doctor to be fetched:");
                        int id1 = scanner.nextInt();
                        scanner.nextLine();
                        Doctor doctorById = hospital.getDoctorById(id1);
                        System.out.println(doctorById);
                        break;

                    case 2:
                        System.out.println("Fetching doctor based on Fees...");
                        System.out.println("Enter the fees from which doctor to be fetched:");
                        int fees = scanner.nextInt();
                        scanner.nextLine();
                        Doctor doctorByFees = hospital.getDoctorByFee(fees);
                        System.out.println(doctorByFees);
                        break;

                    case 3:
                        System.out.println("Fetching doctor based on Experience...");
                        System.out.println("Enter the Experience from which doctor to be fetched:");
                        String experience = scanner.nextLine();
                        Doctor doctorByExperience = hospital.getDoctorByExperience(experience);
                        System.out.println(doctorByExperience);
                        break;

                    case 4:
                        System.out.println("Fetching doctor based on Designation...");
                        System.out.println("Enter the designation from which doctor to be fetched:");
                        String designation = scanner.nextLine();
                        Doctor doctorByDesignation = hospital.getDoctorByDesignation(designation);
                        System.out.println(doctorByDesignation);
                        break;

                    case 5:
                        System.out.println("Fetching experience based on id...");
                        System.out.println("Enter the id from which experience to be fetched:");
                        int doctorId = scanner.nextInt();
                        scanner.nextLine();
                        String experienceById = hospital.getExperienceById(doctorId);
                        System.out.println(experienceById);
                        break;

                    case 6:
                        System.out.println("Fetching experience based on name...");
                        System.out.println("Enter the name from which experience to be fetched:");
                        String doctorName = scanner.nextLine();
                        String experienceByName = hospital.getExperienceByDoctorName(doctorName);
                        System.out.println(experienceByName);
                        break;

                    case 7:
                        System.out.println("Fetching designation based on id...");
                        System.out.println("Enter the id from which designation to be fetched:");
                        int docId = scanner.nextInt();
                        scanner.nextLine();
                        String designationById = hospital.getDesignationById(docId);
                        System.out.println(designationById);
                        break;

                    case 8:
                        System.out.println("Fetching designation based on name...");
                        System.out.println("Enter the name from which designation to be fetched:");
                        String name = scanner.nextLine();
                        String designationByName = hospital.getDesignationByName(name);
                        System.out.println(designationByName);
                        break;

                    case 9:
                        System.out.println("Fetching Fee based on id..");
                        System.out.println("Enter the id from which fee to be fetched:");
                        int id2 = scanner.nextInt();
                        scanner.nextLine();
                        try {
                            int feeByid = hospital.getFeeById(id2);
                            System.out.println(feeByid);
                        } catch (FeeNotFoundException e) {
                            e.getMessage();
                        }
                        break;

                    case 10:
                        System.out.println("Fetching Fee based on name..");
                        System.out.println("Enter the name from which fee to be fetched:");
                        String name1 = scanner.nextLine();
                        try {
                            int feeByName = hospital.getFeeByDoctorName(name1);
                            System.out.println(feeByName);
                        } catch (FeeNotFoundException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 11:
                        System.out.println("fetching specialization based on name..");
                        System.out.println("Enter the name for which specialization to be fetched:");
                        String name2 = scanner.nextLine();
                        try {
                            String[] specializationByName = hospital.getSpecializationByDoctorName(name2);
                            for (String specialization1 : specializationByName) {
                                System.out.println(specialization1);
                            }
                        } catch (SpecializationNotFoundException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 12:
                        System.out.println("Updating Fee based on Experience..");
                        System.out.println("Enter new fees:");
                        int newFee = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter experience:");
                        String experience1 = scanner.nextLine();
                        boolean updateFee = hospital.updateFeeByExperience(newFee, experience1);
                        System.out.println(updateFee);
                        break;

                    case 13:
                        System.out.println("fetching all doctors..");
                        hospital.getAllDoctors();
                        break;

                    default:
                        System.out.println("Hey Invalid option..!");
                }
                System.out.println("Do you want to continue? Enter (Y or N)");
                yesOrNo = scanner.nextLine();

            } while (yesOrNo.equalsIgnoreCase("y"));
            System.out.println("---Thank You---");
        }catch (Exception e){
            scanner.close();
        }
    }
}