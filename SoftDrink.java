class SoftDrink {

    String brand;
    String name;
    String flavor;
    String size;
    double price;
    String color;
    String packaging;
    int quantity;
    String manufacturer;
    boolean isCarbonated;


    SoftDrink() {

    }


    SoftDrink(String brand) {

        this.brand = brand;
    }


    SoftDrink(String brand, String name) {

        this.brand = brand;
        this.name = name;
    }


    SoftDrink(String brand, String name, String flavor) {

        this.brand = brand;
        this.name = name;
        this.flavor = flavor;
    }


    SoftDrink(String brand, String name, String flavor,
              String size) {

        this.brand = brand;
        this.name = name;
        this.flavor = flavor;
        this.size = size;
    }


    SoftDrink(String brand, String name, String flavor,
              String size, double price) {

        this.brand = brand;
        this.name = name;
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }


    SoftDrink(String brand, String name, String flavor,
              String size, double price, String color) {

        this.brand = brand;
        this.name = name;
        this.flavor = flavor;
        this.size = size;
        this.price = price;
        this.color = color;
    }


    SoftDrink(String brand, String name, String flavor,
              String size, double price, String color,
              String packaging) {

        this.brand = brand;
        this.name = name;
        this.flavor = flavor;
        this.size = size;
        this.price = price;
        this.color = color;
        this.packaging = packaging;
    }


    SoftDrink(String brand, String name, String flavor,
              String size, double price, String color,
              String packaging, int quantity) {

        this.brand = brand;
        this.name = name;
        this.flavor = flavor;
        this.size = size;
        this.price = price;
        this.color = color;
        this.packaging = packaging;
        this.quantity = quantity;
    }


    SoftDrink(String brand, String name, String flavor,
              String size, double price, String color,
              String packaging, int quantity,
              String manufacturer) {

        this.brand = brand;
        this.name = name;
        this.flavor = flavor;
        this.size = size;
        this.price = price;
        this.color = color;
        this.packaging = packaging;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }


    SoftDrink(String brand, String name, String flavor,
              String size, double price, String color,
              String packaging, int quantity,
              String manufacturer, boolean isCarbonated) {

        this.brand = brand;
        this.name = name;
        this.flavor = flavor;
        this.size = size;
        this.price = price;
        this.color = color;
        this.packaging = packaging;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.isCarbonated = isCarbonated;
    }


    SoftDrink(String brand, String name, String flavor,
              String size, double price, String color,
              String packaging, int quantity,
              String manufacturer, boolean isCarbonated,
              int extraValue) {

        this.brand = brand;
        this.name = name;
        this.flavor = flavor;
        this.size = size;
        this.price = price;
        this.color = color;
        this.packaging = packaging;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.isCarbonated = isCarbonated;
    }


    void displayInfo() {

        System.out.println("Brand : " + brand);
        System.out.println("Name : " + name);
        System.out.println("Flavor : " + flavor);
        System.out.println("Size : " + size);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
        System.out.println("Packaging : " + packaging);
        System.out.println("Quantity : " + quantity);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Carbonated : " + isCarbonated);

        System.out.println("-----------------------------");
    }
}