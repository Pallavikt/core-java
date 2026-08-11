class Tyre {

    String brand;
    String vehicleType;
    String model;
    String size;
    double price;
    String material;
    String pattern;
    int warranty;
    String speedRating;
    boolean isTubeless;

    Tyre(String brand, String vehicleType, String model,
         String size, double price, String material,
         String pattern, int warranty, String speedRating,
         boolean isTubeless) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.size = size;
        this.price = price;
        this.material = material;
        this.pattern = pattern;
        this.warranty = warranty;
        this.speedRating = speedRating;
        this.isTubeless = isTubeless;
    }

    void displayInfo() {

        System.out.println("Brand : " + brand);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Model : " + model);
        System.out.println("Size : " + size);
        System.out.println("Price : " + price);
        System.out.println("Material : " + material);
        System.out.println("Pattern : " + pattern);
        System.out.println("Warranty : " + warranty);
        System.out.println("Speed Rating : " + speedRating);
        System.out.println("Tubeless : " + isTubeless);
        System.out.println("-----------------------------");
    }
}