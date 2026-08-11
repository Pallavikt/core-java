class RocketRunner {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket(
            "PSLV", "India", "Solid Fuel", 44.4,
            320000, "ISRO", "Sriharikota", 4,
            7800, false
        );

        Rocket rocket2 = new Rocket(
            "GSLV", "India", "Cryogenic", 49.1,
            420000, "ISRO", "Sriharikota", 3,
            7600, false
        );

        Rocket rocket3 = new Rocket(
            "Falcon 9", "USA", "Liquid Fuel", 70,
            549000, "SpaceX", "Florida", 2,
            10000, true
        );

        rocket1.displayInfo();
        rocket2.displayInfo();
        rocket3.displayInfo();
    }
}