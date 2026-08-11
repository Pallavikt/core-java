class WindShieldRunner {

    public static void main(String[] args) {

        WindShield glass1 = new WindShield(
            "Saint-Gobain", "Car", "Creta", "Laminated",
            12000, "Clear", "5mm", "Large",
            "Saint-Gobain", true
        );

        WindShield glass2 = new WindShield(
            "AIS", "Car", "Swift", "Laminated",
            9000, "Green", "4mm", "Medium",
            "AIS Glass", true
        );

        WindShield glass3 = new WindShield(
            "Fuyao", "Car", "Nexon", "Tempered",
            8500, "Clear", "5mm", "Large",
            "Fuyao Glass", false
        );

        glass1.displayInfo();
        glass2.displayInfo();
        glass3.displayInfo();
    }
}