class LocketRunner {

    public static void main(String[] args) {

        Locket locket1 = new Locket();

        Locket locket2 = new Locket("Gold");

        Locket locket3 = new Locket("Gold", "Heart");

        Locket locket4 = new Locket("Gold", "Heart", "Golden");

        Locket locket5 = new Locket(
                "Gold", "Heart", "Golden", 15000
        );

        Locket locket6 = new Locket(
                "Gold", "Heart", "Golden", 15000,
                "Tanishq"
        );

        Locket locket7 = new Locket(
                "Gold", "Heart", "Golden", 15000,
                "Tanishq", "Floral"
        );

        Locket locket8 = new Locket(
                "Gold", "Heart", "Golden", 15000,
                "Tanishq", "Floral", "Medium"
        );

        Locket locket9 = new Locket(
                "Gold", "Heart", "Golden", 15000,
                "Tanishq", "Floral", "Medium", "Wedding"
        );

        Locket locket10 = new Locket(
                "Gold", "Heart", "Golden", 15000,
                "Tanishq", "Floral", "Medium",
                "Wedding", "Women"
        );

        Locket locket11 = new Locket(
                "Gold", "Heart", "Golden", 15000,
                "Tanishq", "Floral", "Medium",
                "Wedding", "Women", true
        );

        Locket locket12 = new Locket(
                "Gold", "Heart", "Golden", 15000,
                "Tanishq", "Floral", "Medium",
                "Wedding", "Women", true, 10
        );


        locket1.displayInfo();
        locket2.displayInfo();
        locket3.displayInfo();
        locket4.displayInfo();
        locket5.displayInfo();
        locket6.displayInfo();
        locket7.displayInfo();
        locket8.displayInfo();
        locket9.displayInfo();
        locket10.displayInfo();
        locket11.displayInfo();
        locket12.displayInfo();

    }
}