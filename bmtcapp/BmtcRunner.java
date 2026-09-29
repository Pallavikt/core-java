package com.xworkz.bmtcapp;

import com.xworkz.bmtcapp.bmtc.Bmtc;
import com.xworkz.bmtcapp.platform.Platform;

public class BmtcRunner {

    public static void main(String[] args) {

        Bmtc bmtc = new Bmtc();

        Platform platform = new Platform();
        platform.setPlatformId(1);
        platform.setPlatformName("Platform 1");
        platform.setLocation("Majestic");
        platform.setBusCount(35);
        bmtc.addPlatform(platform);

        Platform platform1 = new Platform();
        platform1.setPlatformId(2);
        platform1.setPlatformName("Platform 2");
        platform1.setLocation("Shivajinagar");
        platform1.setBusCount(28);
        bmtc.addPlatform(platform1);

        Platform platform2 = new Platform();
        platform2.setPlatformId(3);
        platform2.setPlatformName("Platform 3");
        platform2.setLocation("Yeshwanthpur");
        platform2.setBusCount(32);
        bmtc.addPlatform(platform2);

        Platform platform3 = new Platform();
        platform3.setPlatformId(4);
        platform3.setPlatformName("Platform 4");
        platform3.setLocation("Kengeri");
        platform3.setBusCount(24);
        bmtc.addPlatform(platform3);

        Platform platform4 = new Platform();
        platform4.setPlatformId(5);
        platform4.setPlatformName("Platform 5");
        platform4.setLocation("Banashankari");
        platform4.setBusCount(30);
        bmtc.addPlatform(platform4);

        Platform platform5 = new Platform();
        platform5.setPlatformId(6);
        platform5.setPlatformName("Platform 6");
        platform5.setLocation("KR Market");
        platform5.setBusCount(38);
        bmtc.addPlatform(platform5);

        Platform platform6 = new Platform();
        platform6.setPlatformId(7);
        platform6.setPlatformName("Platform 7");
        platform6.setLocation("Electronic City");
        platform6.setBusCount(26);
        bmtc.addPlatform(platform6);

        Platform platform7 = new Platform();
        platform7.setPlatformId(8);
        platform7.setPlatformName("Platform 8");
        platform7.setLocation("Hebbal");
        platform7.setBusCount(31);
        bmtc.addPlatform(platform7);

        Platform platform8 = new Platform();
        platform8.setPlatformId(9);
        platform8.setPlatformName("Platform 9");
        platform8.setLocation("Silk Board");
        platform8.setBusCount(40);
        bmtc.addPlatform(platform8);

        Platform platform9 = new Platform();
        platform9.setPlatformId(10);
        platform9.setPlatformName("Platform 10");
        platform9.setLocation("Jayanagar");
        platform9.setBusCount(22);
        bmtc.addPlatform(platform9);

        Platform platform10 = new Platform();
        platform10.setPlatformId(11);
        platform10.setPlatformName("Platform 11");
        platform10.setLocation("Vijayanagar");
        platform10.setBusCount(29);
        bmtc.addPlatform(platform10);

        Platform platform11 = new Platform();
        platform11.setPlatformId(12);
        platform11.setPlatformName("Platform 12");
        platform11.setLocation("Whitefield");
        platform11.setBusCount(33);
        bmtc.addPlatform(platform11);

        Platform platform12 = new Platform();
        platform12.setPlatformId(13);
        platform12.setPlatformName("Platform 13");
        platform12.setLocation("Marathahalli");
        platform12.setBusCount(36);
        bmtc.addPlatform(platform12);

        Platform platform13 = new Platform();
        platform13.setPlatformId(14);
        platform13.setPlatformName("Platform 14");
        platform13.setLocation("BTM Layout");
        platform13.setBusCount(25);
        bmtc.addPlatform(platform13);

        Platform platform14 = new Platform();
        platform14.setPlatformId(15);
        platform14.setPlatformName("Platform 15");
        platform14.setLocation("JP Nagar");
        platform14.setBusCount(21);
        bmtc.addPlatform(platform14);

        Platform platform15 = new Platform();
        platform15.setPlatformId(16);
        platform15.setPlatformName("Platform 16");
        platform15.setLocation("Rajajinagar");
        platform15.setBusCount(27);
        bmtc.addPlatform(platform15);

        Platform platform16 = new Platform();
        platform16.setPlatformId(17);
        platform16.setPlatformName("Platform 17");
        platform16.setLocation("Malleshwaram");
        platform16.setBusCount(23);
        bmtc.addPlatform(platform16);

        Platform platform17 = new Platform();
        platform17.setPlatformId(18);
        platform17.setPlatformName("Platform 18");
        platform17.setLocation("Koramangala");
        platform17.setBusCount(34);
        bmtc.addPlatform(platform17);

        Platform platform18 = new Platform();
        platform18.setPlatformId(19);
        platform18.setPlatformName("Platform 19");
        platform18.setLocation("HSR Layout");
        platform18.setBusCount(20);
        bmtc.addPlatform(platform18);

        Platform platform19 = new Platform();
        platform19.setPlatformId(20);
        platform19.setPlatformName("Platform 20");
        platform19.setLocation("Domlur");
        platform19.setBusCount(18);
        bmtc.addPlatform(platform19);

        Platform platform20 = new Platform();
        platform20.setPlatformId(21);
        platform20.setPlatformName("Platform 21");
        platform20.setLocation("Indiranagar");
        platform20.setBusCount(26);
        bmtc.addPlatform(platform20);

        Platform platform21 = new Platform();
        platform21.setPlatformId(22);
        platform21.setPlatformName("Platform 22");
        platform21.setLocation("Yelahanka");
        platform21.setBusCount(24);
        bmtc.addPlatform(platform21);

        Platform platform22 = new Platform();
        platform22.setPlatformId(23);
        platform22.setPlatformName("Platform 23");
        platform22.setLocation("Nagarabhavi");
        platform22.setBusCount(19);
        bmtc.addPlatform(platform22);

        Platform platform23 = new Platform();
        platform23.setPlatformId(24);
        platform23.setPlatformName("Platform 24");
        platform23.setLocation("Peenya");
        platform23.setBusCount(30);
        bmtc.addPlatform(platform23);

        Platform platform24 = new Platform();
        platform24.setPlatformId(25);
        platform24.setPlatformName("Platform 25");
        platform24.setLocation("Bommanahalli");
        platform24.setBusCount(22);
        bmtc.addPlatform(platform24);

        Platform platform25 = new Platform();
        platform25.setPlatformId(26);
        platform25.setPlatformName("Platform 26");
        platform25.setLocation("Kengeri Satellite Town");
        platform25.setBusCount(28);
        bmtc.addPlatform(platform25);

        // Displays all 26 Platform objects stored in BMTC
        bmtc.getAllPlatforms();
    }
}