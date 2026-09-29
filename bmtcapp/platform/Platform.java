package com.xworkz.bmtcapp.platform;

public class Platform {

    private int platformId;
    private String platformName;
    private String location;
    private int busCount;

    public int getPlatformId() {
        return platformId;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBusCount() {
        return busCount;
    }

    public void setBusCount(int busCount) {
        this.busCount = busCount;
    }

    @Override
    public String toString() {
        return "Platform(platformId = " + this.platformId + ", platformName = " + this.platformName +
                ", location = " + this.location + ", busCount = " + this.busCount + ")";
    }
}