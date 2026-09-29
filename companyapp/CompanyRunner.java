package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.software.Software;

public class CompanyRunner {

    public static void main(String[] args) {

        Company company = new Company();

        Software software = new Software();
        software.setSoftwareId(1);
        software.setSoftwareName("IntelliJ IDEA");
        software.setVersion("2026.2");
        software.setPrice(16999);
        company.addSoftware(software);

        Software software1 = new Software();
        software1.setSoftwareId(2);
        software1.setSoftwareName("Microsoft Office");
        software1.setVersion("2024");
        software1.setPrice(8999);
        company.addSoftware(software1);

        Software software2 = new Software();
        software2.setSoftwareId(3);
        software2.setSoftwareName("Adobe Photoshop");
        software2.setVersion("2026");
        software2.setPrice(19999);
        company.addSoftware(software2);

        Software software3 = new Software();
        software3.setSoftwareId(4);
        software3.setSoftwareName("AutoCAD");
        software3.setVersion("2026");
        software3.setPrice(45000);
        company.addSoftware(software3);

        Software software4 = new Software();
        software4.setSoftwareId(5);
        software4.setSoftwareName("MATLAB");
        software4.setVersion("R2026a");
        software4.setPrice(35000);
        company.addSoftware(software4);

        Software software5 = new Software();
        software5.setSoftwareId(6);
        software5.setSoftwareName("PyCharm");
        software5.setVersion("2026.2");
        software5.setPrice(12999);
        company.addSoftware(software5);

        Software software6 = new Software();
        software6.setSoftwareId(7);
        software6.setSoftwareName("VMware Workstation");
        software6.setVersion("17 Pro");
        software6.setPrice(15999);
        company.addSoftware(software6);

        Software software7 = new Software();
        software7.setSoftwareId(8);
        software7.setSoftwareName("CorelDRAW");
        software7.setVersion("2026");
        software7.setPrice(24999);
        company.addSoftware(software7);

        Software software8 = new Software();
        software8.setSoftwareId(9);
        software8.setSoftwareName("Filmora");
        software8.setVersion("15");
        software8.setPrice(5999);
        company.addSoftware(software8);

        company.getAllSoftwares();
    }
}