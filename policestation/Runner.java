package com.xworkz.policestation;

import com.xworkz.policestation.impl.PoliceStationImpl;
import com.xworkz.policestation.officer.Officer;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int size = scanner.nextInt();

        PoliceStation policeStation = new PoliceStationImpl(size);
        Officer officer = new Officer();

        System.out.println("Enter the ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        officer.id = id;

        System.out.println("Enter the Name:");
        String name = scanner.nextLine();
        officer.officerName = name;

        System.out.println("Enter the Salary:");
        double salary = scanner.nextDouble();
        officer.salary = salary;

        boolean added = policeStation.addOfficer(officer);
        if (added){
            System.out.println("Officer added Successfully.");
        }else System.out.println("Can not add officer");


        String yesOrNo;
        do {
            System.out.println("Enter 1 to fetch all the officers");
            System.out.println("Enter 2 to fetch officer based on id");
            System.out.println("Enter 3 to update Salary based on id");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("Here are the List of all the officers:");
                    policeStation.getAllOfficer();
                    break;

                case 2:
                    System.out.println("Fetching officer based on id");
                    System.out.println("Enter the id from which officer to be fetched:");
                    int officerId = scanner.nextInt();
                    scanner.nextLine();
                    Officer addOfficer = policeStation.getOfficerById(officerId);
                    System.out.println(addOfficer);
                    break;

                case 3:
                    System.out.println("Updating Salary based on Id");
                    System.out.println("Enter the New salary:");
                    double officerSalary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter the id:");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                   boolean updateSalary = policeStation.updateSalaryById(officerSalary,id1);
                    System.out.println(updateSalary);
                    break;

                default:
                    System.out.println("Please Enter the Correct option");
            }
            System.out.println("Do you want to continue? Enter (Y or N)");
            yesOrNo = scanner.nextLine();

        }while (yesOrNo.equalsIgnoreCase("y"));
        System.out.println("---Thank You---");
    }
}
