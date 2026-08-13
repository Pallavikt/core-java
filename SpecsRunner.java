class SpecsRunner {

    public static void main(String[] args) {

        Specs specs1 = new Specs();

        Specs specs2 = new Specs("Ray-Ban");

        Specs specs3 = new Specs(
                "Ray-Ban", "Black"
        );

        Specs specs4 = new Specs(
                "Ray-Ban", "Black", "Metal"
        );

        Specs specs5 = new Specs(
                "Ray-Ban", "Black", "Metal",
                "Anti-Glare"
        );

        Specs specs6 = new Specs(
                "Ray-Ban", "Black", "Metal",
                "Anti-Glare", "Transparent"
        );

        Specs specs7 = new Specs(
                "Ray-Ban", "Black", "Metal",
                "Anti-Glare", "Transparent", 8000
        );

        Specs specs8 = new Specs(
                "Ray-Ban", "Black", "Metal",
                "Anti-Glare", "Transparent", 8000,
                "Round"
        );

        Specs specs9 = new Specs(
                "Ray-Ban", "Black", "Metal",
                "Anti-Glare", "Transparent", 8000,
                "Round", "Medium"
        );

        Specs specs10 = new Specs(
                "Ray-Ban", "Black", "Metal",
                "Anti-Glare", "Transparent", 8000,
                "Round", "Medium", "Unisex"
        );

        Specs specs11 = new Specs(
                "Ray-Ban", "Black", "Metal",
                "Anti-Glare", "Transparent", 8000,
                "Round", "Medium", "Unisex", true
        );

        Specs specs12 = new Specs(
                "Ray-Ban", "Black", "Metal",
                "Anti-Glare", "Transparent", 8000,
                "Round", "Medium", "Unisex", true, 10
        );


        specs1.displayInfo();
        specs2.displayInfo();
        specs3.displayInfo();
        specs4.displayInfo();
        specs5.displayInfo();
        specs6.displayInfo();
        specs7.displayInfo();
        specs8.displayInfo();
        specs9.displayInfo();
        specs10.displayInfo();
        specs11.displayInfo();
        specs12.displayInfo();

    }
}