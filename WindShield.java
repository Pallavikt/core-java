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