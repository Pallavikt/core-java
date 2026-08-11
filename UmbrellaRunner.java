class UmbrellaRunner {

    public static void main(String[] args) {

        Umbrella umbrella1 = new Umbrella(
            "Popy", "Black", "Rain Umbrella", "Polyester",
            600, 42, "Curved", "Manual",
            "Unisex", true
        );

        Umbrella umbrella2 = new Umbrella(
            "Kuberan", "Blue", "Folding", "Nylon",
            450, 38, "Straight", "Automatic",
            "Women", false
        );

        Umbrella umbrella3 = new Umbrella(
            "Wildcraft", "Red", "Travel", "Polyester",
            900, 40, "Straight", "Automatic",
            "Unisex", true
        );

        umbrella1.displayInfo();
        umbrella2.displayInfo();
        umbrella3.displayInfo();
    }
}