class TyreRunner {

    public static void main(String[] args) {

        Tyre tyre1 = new Tyre(
            "MRF", "Car", "ZVTV", "195/65 R15",
            5500, "Rubber", "All Terrain", 5,
            "H", true
        );

        Tyre tyre2 = new Tyre(
            "CEAT", "Car", "Secura", "185/65 R15",
            5000, "Rubber", "Highway", 5,
            "H", true
        );

        Tyre tyre3 = new Tyre(
            "Apollo", "Bike", "ActiGrip", "90/90-18",
            2500, "Rubber", "Sport", 3,
            "P", true
        );

        tyre1.displayInfo();
        tyre2.displayInfo();
        tyre3.displayInfo();
    }
}