class RocketRunner {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();

        Rocket rocket2 = new Rocket(
                "PSLV"
        );

        Rocket rocket3 = new Rocket(
                "PSLV", "India"
        );

        Rocket rocket4 = new Rocket(
                "PSLV", "India", "Solid Fuel"
        );

        Rocket rocket5 = new Rocket(
                "PSLV", "India", "Solid Fuel", 44.4
        );

        Rocket rocket6 = new Rocket(
                "PSLV", "India", "Solid Fuel",
                44.4, 320000
        );

        Rocket rocket7 = new Rocket(
                "PSLV", "India", "Solid Fuel",
                44.4, 320000, "ISRO"
        );

        Rocket rocket8 = new Rocket(
                "PSLV", "India", "Solid Fuel",
                44.4, 320000, "ISRO",
                "Sriharikota"
        );

        Rocket rocket9 = new Rocket(
                "PSLV", "India", "Solid Fuel",
                44.4, 320000, "ISRO",
                "Sriharikota", 4
        );

        Rocket rocket10 = new Rocket(
                "PSLV", "India", "Solid Fuel",
                44.4, 320000, "ISRO",
                "Sriharikota", 4, 7800
        );

        Rocket rocket11 = new Rocket(
                "PSLV", "India", "Solid Fuel",
                44.4, 320000, "ISRO",
                "Sriharikota", 4, 7800, false
        );

        Rocket rocket12 = new Rocket(
                "PSLV", "India", "Solid Fuel",
                44.4, 320000, "ISRO",
                "Sriharikota", 4, 7800, false, 10
        );


        rocket1.displayInfo();
        rocket2.displayInfo();
        rocket3.displayInfo();
        rocket4.displayInfo();
        rocket5.displayInfo();
        rocket6.displayInfo();
        rocket7.displayInfo();
        rocket8.displayInfo();
        rocket9.displayInfo();
        rocket10.displayInfo();
        rocket11.displayInfo();
        rocket12.displayInfo();

    }
}