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


    Tyre() {

    }


    Tyre(String brand) {

        this.brand = brand;
    }


    Tyre(String brand, String vehicleType) {

        this.brand = brand;
        this.vehicleType = vehicleType;
    }


    Tyre(String brand, String vehicleType, String model) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
    }


    Tyre(String brand, String vehicleType, String model,
         String size) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.size = size;
    }


    Tyre(String brand, String vehicleType, String model,
         String size, double price) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.size = size;
        this.price = price;
    }


    Tyre(String brand, String vehicleType, String model,
         String size, double price, String material) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.size = size;
        this.price = price;
        this.material = material;
    }


    Tyre(String brand, String vehicleType, String model,
         String size, double price, String material,
         String pattern) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.size = size;
        this.price = price;
        this.material = material;
        this.pattern = pattern;
    }


    Tyre(String brand, String vehicleType, String model,
         String size, double price, String material,
         String pattern, int warranty) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.size = size;
        this.price = price;
        this.material = material;
        this.pattern = pattern;
        this.warranty = warranty;
    }


    Tyre(String brand, String vehicleType, String model,
         String size, double price, String material,
         String pattern, int warranty, String speedRating) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.size = size;
        this.price = price;
        this.material = material;
        this.pattern = pattern;
        this.warranty = warranty;
        this.speedRating = speedRating;
    }


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


    Tyre(String brand, String vehicleType, String model,
         String size, double price, String material,
         String pattern, int warranty, String speedRating,
         boolean isTubeless, int extraValue) {

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