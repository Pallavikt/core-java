class WindShieldRunner {

    public static void main(String[] args) {

        WindShield windShield1 = new WindShield();

        WindShield windShield2 = new WindShield(
                "Saint-Gobain"
        );

        WindShield windShield3 = new WindShield(
                "Saint-Gobain", "Car"
        );

        WindShield windShield4 = new WindShield(
                "Saint-Gobain", "Car", "Creta"
        );

        WindShield windShield5 = new WindShield(
                "Saint-Gobain", "Car", "Creta",
                "Laminated"
        );

        WindShield windShield6 = new WindShield(
                "Saint-Gobain", "Car", "Creta",
                "Laminated", 12000
        );

        WindShield windShield7 = new WindShield(
                "Saint-Gobain", "Car", "Creta",
                "Laminated", 12000, "Clear"
        );

        WindShield windShield8 = new WindShield(
                "Saint-Gobain", "Car", "Creta",
                "Laminated", 12000, "Clear",
                "5mm"
        );

        WindShield windShield9 = new WindShield(
                "Saint-Gobain", "Car", "Creta",
                "Laminated", 12000, "Clear",
                "5mm", "1400x800mm"
        );

        WindShield windShield10 = new WindShield(
                "Saint-Gobain", "Car", "Creta",
                "Laminated", 12000, "Clear",
                "5mm", "1400x800mm", "Saint-Gobain"
        );

        WindShield windShield11 = new WindShield(
                "Saint-Gobain", "Car", "Creta",
                "Laminated", 12000, "Clear",
                "5mm", "1400x800mm", "Saint-Gobain", true
        );

        WindShield windShield12 = new WindShield(
                "Saint-Gobain", "Car", "Creta",
                "Laminated", 12000, "Clear",
                "5mm", "1400x800mm", "Saint-Gobain", true, 10
        );


        windShield1.displayInfo();
        windShield2.displayInfo();
        windShield3.displayInfo();
        windShield4.displayInfo();
        windShield5.displayInfo();
        windShield6.displayInfo();
        windShield7.displayInfo();
        windShield8.displayInfo();
        windShield9.displayInfo();
        windShield10.displayInfo();
        windShield11.displayInfo();
        windShield12.displayInfo();

    }
}