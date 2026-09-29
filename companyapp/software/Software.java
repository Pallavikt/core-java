package com.xworkz.companyapp.software;

public class Software {

    private int softwareId;
    private String softwareName;
    private String version;
    private int price;

    public int getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(int softwareId) {
        this.softwareId = softwareId;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Software(softwareId = " + this.softwareId + ", softwareName = " + this.softwareName +
                ", version = " + this.version + ", price = " + this.price + ")";
    }
}