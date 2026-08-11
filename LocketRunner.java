class LocketRunner {

    public static void main(String[] args) {

        Locket locket1 = new Locket(
            "Gold", "Heart", "Golden", 15000,
            "Tanishq", "Floral", "Medium", "Wedding",
            "Women", true
        );

        Locket locket2 = new Locket(
            "Silver", "Round", "Silver", 5000,
            "Malabar", "Classic", "Small", "Birthday",
            "Women", false
        );

        Locket locket3 = new Locket(
            "Gold", "Oval", "Rose Gold", 18000,
            "Kalyan", "Traditional", "Large", "Festival",
            "Unisex", true
        );

        locket1.displayInfo();
        locket2.displayInfo();
        locket3.displayInfo();
    }
}