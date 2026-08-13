class StampRunner {

    public static void main(String[] args) {

        Stamp stamp1 = new Stamp();

        Stamp stamp2 = new Stamp(
                "Approved"
        );

        Stamp stamp3 = new Stamp(
                "Approved", "Blue"
        );

        Stamp stamp4 = new Stamp(
                "Approved", "Blue", "Rubber"
        );

        Stamp stamp5 = new Stamp(
                "Approved", "Blue", "Rubber",
                "Office"
        );

        Stamp stamp6 = new Stamp(
                "Approved", "Blue", "Rubber",
                "Office", 150
        );

        Stamp stamp7 = new Stamp(
                "Approved", "Blue", "Rubber",
                "Office", 150, "Medium"
        );

        Stamp stamp8 = new Stamp(
                "Approved", "Blue", "Rubber",
                "Office", 150, "Medium",
                "Rectangle"
        );

        Stamp stamp9 = new Stamp(
                "Approved", "Blue", "Rubber",
                "Office", 150, "Medium",
                "Rectangle", "Office"
        );

        Stamp stamp10 = new Stamp(
                "Approved", "Blue", "Rubber",
                "Office", 150, "Medium",
                "Rectangle", "Office", "Wood"
        );

        Stamp stamp11 = new Stamp(
                "Approved", "Blue", "Rubber",
                "Office", 150, "Medium",
                "Rectangle", "Office", "Wood", false
        );

        Stamp stamp12 = new Stamp(
                "Approved", "Blue", "Rubber",
                "Office", 150, "Medium",
                "Rectangle", "Office", "Wood", false, 10
        );


        stamp1.displayInfo();
        stamp2.displayInfo();
        stamp3.displayInfo();
        stamp4.displayInfo();
        stamp5.displayInfo();
        stamp6.displayInfo();
        stamp7.displayInfo();
        stamp8.displayInfo();
        stamp9.displayInfo();
        stamp10.displayInfo();
        stamp11.displayInfo();
        stamp12.displayInfo();

    }
}