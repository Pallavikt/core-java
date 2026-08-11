class SpecsRunner {

    public static void main(String[] args) {

        Specs specs1 = new Specs(
            "Ray-Ban", "Black", "Metal", "Anti-Glare",
            "Transparent", 8000, "Round", "Medium",
            "Unisex", true
        );

        Specs specs2 = new Specs(
            "Fastrack", "Blue", "Plastic", "UV Protection",
            "Transparent", 3500, "Square", "Large",
            "Men", false
        );

        Specs specs3 = new Specs(
            "Titan", "Brown", "Acetate", "Blue Cut",
            "Transparent", 6000, "Oval", "Medium",
            "Women", true
        );

        specs1.displayInfo();
        specs2.displayInfo();
        specs3.displayInfo();
    }
}