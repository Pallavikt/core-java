class TyreRunner {

    public static void main(String[] args) {

        Tyre tyre1 = new Tyre();

        Tyre tyre2 = new Tyre(
                "MRF"
        );

        Tyre tyre3 = new Tyre(
                "MRF", "Car"
        );

        Tyre tyre4 = new Tyre(
                "MRF", "Car", "ZVTV"
        );

        Tyre tyre5 = new Tyre(
                "MRF", "Car", "ZVTV",
                "195/65 R15"
        );

        Tyre tyre6 = new Tyre(
                "MRF", "Car", "ZVTV",
                "195/65 R15", 5500
        );

        Tyre tyre7 = new Tyre(
                "MRF", "Car", "ZVTV",
                "195/65 R15", 5500,
                "Rubber"
        );

        Tyre tyre8 = new Tyre(
                "MRF", "Car", "ZVTV",
                "195/65 R15", 5500,
                "Rubber", "Radial"
        );

        Tyre tyre9 = new Tyre(
                "MRF", "Car", "ZVTV",
                "195/65 R15", 5500,
                "Rubber", "Radial", 5
        );

        Tyre tyre10 = new Tyre(
                "MRF", "Car", "ZVTV",
                "195/65 R15", 5500,
                "Rubber", "Radial", 5,
                "H"
        );

        Tyre tyre11 = new Tyre(
                "MRF", "Car", "ZVTV",
                "195/65 R15", 5500,
                "Rubber", "Radial", 5,
                "H", true
        );

        Tyre tyre12 = new Tyre(
                "MRF", "Car", "ZVTV",
                "195/65 R15", 5500,
                "Rubber", "Radial", 5,
                "H", true, 10
        );


        tyre1.displayInfo();
        tyre2.displayInfo();
        tyre3.displayInfo();
        tyre4.displayInfo();
        tyre5.displayInfo();
        tyre6.displayInfo();
        tyre7.displayInfo();
        tyre8.displayInfo();
        tyre9.displayInfo();
        tyre10.displayInfo();
        tyre11.displayInfo();
        tyre12.displayInfo();

    }
}