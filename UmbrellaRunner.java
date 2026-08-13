class UmbrellaRunner {

    public static void main(String[] args) {

        Umbrella umbrella1 = new Umbrella();

        Umbrella umbrella2 = new Umbrella(
                "Popy"
        );

        Umbrella umbrella3 = new Umbrella(
                "Popy", "Black"
        );

        Umbrella umbrella4 = new Umbrella(
                "Popy", "Black", "Rain Umbrella"
        );

        Umbrella umbrella5 = new Umbrella(
                "Popy", "Black", "Rain Umbrella",
                "Polyester"
        );

        Umbrella umbrella6 = new Umbrella(
                "Popy", "Black", "Rain Umbrella",
                "Polyester", 600
        );

        Umbrella umbrella7 = new Umbrella(
                "Popy", "Black", "Rain Umbrella",
                "Polyester", 600, 42
        );

        Umbrella umbrella8 = new Umbrella(
                "Popy", "Black", "Rain Umbrella",
                "Polyester", 600, 42,
                "Curved"
        );

        Umbrella umbrella9 = new Umbrella(
                "Popy", "Black", "Rain Umbrella",
                "Polyester", 600, 42,
                "Curved", "Manual"
        );

        Umbrella umbrella10 = new Umbrella(
                "Popy", "Black", "Rain Umbrella",
                "Polyester", 600, 42,
                "Curved", "Manual", "Unisex"
        );

        Umbrella umbrella11 = new Umbrella(
                "Popy", "Black", "Rain Umbrella",
                "Polyester", 600, 42,
                "Curved", "Manual", "Unisex", true
        );

        Umbrella umbrella12 = new Umbrella(
                "Popy", "Black", "Rain Umbrella",
                "Polyester", 600, 42,
                "Curved", "Manual", "Unisex", true, 10
        );


        umbrella1.displayInfo();
        umbrella2.displayInfo();
        umbrella3.displayInfo();
        umbrella4.displayInfo();
        umbrella5.displayInfo();
        umbrella6.displayInfo();
        umbrella7.displayInfo();
        umbrella8.displayInfo();
        umbrella9.displayInfo();
        umbrella10.displayInfo();
        umbrella11.displayInfo();
        umbrella12.displayInfo();

    }
}