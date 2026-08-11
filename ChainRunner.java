class ChainRunner {

    public static void main(String[] args) {

        Chain chain1 = new Chain(
            "Gold", "Golden", 50000, "Tanishq",
            "Traditional", "22 inch", "20g",
            "Neck Chain", "Wedding", true
        );

        Chain chain2 = new Chain(
            "Silver", "Silver", 8000, "Malabar",
            "Simple", "20 inch", "30g",
            "Daily Wear", "Casual", true
        );

        Chain chain3 = new Chain(
            "Gold", "Rose Gold", 75000, "Kalyan",
            "Designer", "24 inch", "25g",
            "Neck Chain", "Festival", true
        );

        chain1.displayInfo();
        chain2.displayInfo();
        chain3.displayInfo();
    }
}