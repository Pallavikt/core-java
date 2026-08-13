class ChainRunner {

    public static void main(String[] args) {

        Chain chain1 = new Chain();

        Chain chain2 = new Chain(
                "Gold"
        );

        Chain chain3 = new Chain(
                "Gold", "Golden"
        );

        Chain chain4 = new Chain(
                "Gold", "Golden", 50000
        );

        Chain chain5 = new Chain(
                "Gold", "Golden", 50000,
                "Tanishq"
        );

        Chain chain6 = new Chain(
                "Gold", "Golden", 50000,
                "Tanishq", "Traditional"
        );

        Chain chain7 = new Chain(
                "Gold", "Golden", 50000,
                "Tanishq", "Traditional", "22 inch"
        );

        Chain chain8 = new Chain(
                "Gold", "Golden", 50000,
                "Tanishq", "Traditional", "22 inch",
                "20g"
        );

        Chain chain9 = new Chain(
                "Gold", "Golden", 50000,
                "Tanishq", "Traditional", "22 inch",
                "20g", "Neck Chain"
        );

        Chain chain10 = new Chain(
                "Gold", "Golden", 50000,
                "Tanishq", "Traditional", "22 inch",
                "20g", "Neck Chain", "Wedding"
        );

        Chain chain11 = new Chain(
                "Gold", "Golden", 50000,
                "Tanishq", "Traditional", "22 inch",
                "20g", "Neck Chain", "Wedding", true
        );

        Chain chain12 = new Chain(
                "Gold", "Golden", 50000,
                "Tanishq", "Traditional", "22 inch",
                "20g", "Neck Chain", "Wedding", true, 10
        );


        chain1.displayInfo();
        chain2.displayInfo();
        chain3.displayInfo();
        chain4.displayInfo();
        chain5.displayInfo();
        chain6.displayInfo();
        chain7.displayInfo();
        chain8.displayInfo();
        chain9.displayInfo();
        chain10.displayInfo();
        chain11.displayInfo();
        chain12.displayInfo();

    }
}