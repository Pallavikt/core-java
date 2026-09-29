package com.xworkz.companyapp.company;

import com.xworkz.companyapp.software.Software;

public class Company {

    private Software[] softwares = new Software[9];
    int index;

    public boolean addSoftware(Software software) {

        boolean isAdded = false;
        boolean isSoftwareIdValid = false;
        boolean isSoftwareNameValid = false;
        boolean isVersionValid = false;
        boolean isPriceValid = false;

        int softwareId = software.getSoftwareId();

        if (softwareId > 0) {
            isSoftwareIdValid = true;
        } else {
            System.out.println("Software Id is Invalid");
        }

        String softwareName = software.getSoftwareName();

        if (softwareName != null && !softwareName.isEmpty()) {
            isSoftwareNameValid = true;
        } else {
            System.out.println("Software Name is Invalid");
        }

        String version = software.getVersion();

        if (version != null && !version.isEmpty()) {
            isVersionValid = true;
        } else {
            System.out.println("Version is Invalid");
        }

        int price = software.getPrice();

        if (price > 0) {
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        if (isSoftwareIdValid && isSoftwareNameValid && isVersionValid && isPriceValid) {

            softwares[index++] = software;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllSoftwares() {

        for (Software software : softwares) {
            System.out.println(software);
        }
    }
}