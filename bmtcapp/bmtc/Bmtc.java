package com.xworkz.bmtcapp.bmtc;

import com.xworkz.bmtcapp.platform.Platform;

public class Bmtc {

    // Has-A relationship → BMTC has multiple Platform objects
    private Platform[] platforms = new Platform[26];

    // index → points to the next available position in the array
    int index;

    public boolean addPlatform(Platform platform) {

        boolean isAdded = false;
        boolean isPlatformIdValid = false;
        boolean isPlatformNameValid = false;
        boolean isLocationValid = false;
        boolean isBusCountValid = false;

        int platformId = platform.getPlatformId();

        if (platformId > 0) {
            isPlatformIdValid = true;
        } else {
            System.out.println("Platform Id is Invalid");
        }

        String platformName = platform.getPlatformName();

        if (platformName != null && !platformName.isEmpty()) {
            isPlatformNameValid = true;
        } else {
            System.out.println("Platform Name is Invalid");
        }

        String location = platform.getLocation();

        if (location != null && !location.isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Location is Invalid");
        }

        int busCount = platform.getBusCount();

        if (busCount > 0) {
            isBusCountValid = true;
        } else {
            System.out.println("Bus Count is Invalid");
        }

        // Stores the object only when all fields are valid
        if (isPlatformIdValid && isPlatformNameValid && isLocationValid && isBusCountValid) {

            platforms[index++] = platform;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllPlatforms() {

        for (Platform platform : platforms) {
            System.out.println(platform);
        }
    }
}