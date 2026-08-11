class StampRunner {

    public static void main(String[] args) {

        Stamp stamp1 = new Stamp(
            "Approved", "Blue", "Rubber", "Office",
            150, "Medium", "Rectangle", "Office",
            "Wood", false
        );

        Stamp stamp2 = new Stamp(
            "Paid", "Red", "Rubber", "Office",
            180, "Small", "Round", "Accounts",
            "Plastic", true
        );

        Stamp stamp3 = new Stamp(
            "Received", "Black", "Rubber", "Office",
            200, "Large", "Rectangle", "Office",
            "Wood", true
        );

        stamp1.displayInfo();
        stamp2.displayInfo();
        stamp3.displayInfo();
    }
}