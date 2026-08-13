class WindShield {

    String brand;
    String vehicleType;
    String model;
    String glassType;
    double price;
    String color;
    String thickness;
    String size;
    String manufacturer;
    boolean isUVProtected;


    WindShield() {

    }


    WindShield(String brand) {

        this.brand = brand;
    }


    WindShield(String brand, String vehicleType) {

        this.brand = brand;
        this.vehicleType = vehicleType;
    }


    WindShield(String brand, String vehicleType, String model) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
    }


    WindShield(String brand, String vehicleType, String model,
               String glassType) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.glassType = glassType;
    }


    WindShield(String brand, String vehicleType, String model,
               String glassType, double price) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.glassType = glassType;
        this.price = price;
    }


    WindShield(String brand, String vehicleType, String model,
               String glassType, double price, String color) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.glassType = glassType;
        this.price = price;
        this.color = color;
    }


    WindShield(String brand, String vehicleType, String model,
               String glassType, double price, String color,
               String thickness) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.glassType = glassType;
        this.price = price;
        this.color = color;
        this.thickness = thickness;
    }


    WindShield(String brand, String vehicleType, String model,
               String glassType, double price, String color,
               String thickness, String size) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.glassType = glassType;
        this.price = price;
        this.color = color;
        this.thickness = thickness;
        this.size = size;
    }


    WindShield(String brand, String vehicleType, String model,
               String glassType, double price, String color,
               String thickness, String size, String manufacturer) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.glassType = glassType;
        this.price = price;
        this.color = color;
        this.thickness = thickness;
        this.size = size;
        this.manufacturer = manufacturer;
    }


    WindShield(String brand, String vehicleType, String model,
               String glassType, double price, String color,
               String thickness, String size, String manufacturer,
               boolean isUVProtected) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.glassType = glassType;
        this.price = price;
        this.color = color;
        this.thickness = thickness;
        this.size = size;
        this.manufacturer = manufacturer;
        this.isUVProtected = isUVProtected;
    }


    WindShield(String brand, String vehicleType, String model,
               String glassType, double price, String color,
               String thickness, String size, String manufacturer,
               boolean isUVProtected, int extraValue) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.model = model;
        this.glassType = glassType;
        this.price = price;
        this.color = color;
        this.thickness = thickness;
        this.size = size;
        this.manufacturer = manufacturer;
        this.isUVProtected = isUVProtected;
    }


    void displayInfo() {

        System.out.println("Brand : " + brand);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Model : " + model);
        System.out.println("Glass Type : " + glassType);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
        System.out.println("Thickness : " + thickness);
        System.out.println("Size : " + size);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("UV Protected : " + isUVProtected);

        System.out.println("-----------------------------");
    }
}