class Boomer {

    String brand;
    String flavor;
    String color;
    double price;
    String shape;
    String packType;
    int quantity;
    String category;
    String manufacturer;
    boolean isSugarFree;


    Boomer() {

    }


    Boomer(String brand) {

        this.brand = brand;
    }


    Boomer(String brand, String flavor) {

        this.brand = brand;
        this.flavor = flavor;
    }


    Boomer(String brand, String flavor, String color) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
    }


    Boomer(String brand, String flavor, String color, double price) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
    }


    Boomer(String brand, String flavor, String color,
           double price, String shape) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.shape = shape;
    }


    Boomer(String brand, String flavor, String color,
           double price, String shape, String packType) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.shape = shape;
        this.packType = packType;
    }


    Boomer(String brand, String flavor, String color,
           double price, String shape, String packType,
           int quantity) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
    }


    Boomer(String brand, String flavor, String color,
           double price, String shape, String packType,
           int quantity, String category) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
        this.category = category;
    }


    Boomer(String brand, String flavor, String color,
           double price, String shape, String packType,
           int quantity, String category, String manufacturer) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
        this.category = category;
        this.manufacturer = manufacturer;
    }


    Boomer(String brand, String flavor, String color,
           double price, String shape, String packType,
           int quantity, String category, String manufacturer,
           boolean isSugarFree) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
        this.category = category;
        this.manufacturer = manufacturer;
        this.isSugarFree = isSugarFree;
    }


    Boomer(String brand, String flavor, String color,
           double price, String shape, String packType,
           int quantity, String category, String manufacturer,
           boolean isSugarFree, int extraValue) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
        this.category = category;
        this.manufacturer = manufacturer;
        this.isSugarFree = isSugarFree;
    }


    void displayInfo() {

        System.out.println("Brand : " + brand);
        System.out.println("Flavor : " + flavor);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Shape : " + shape);
        System.out.println("Pack Type : " + packType);
        System.out.println("Quantity : " + quantity);
        System.out.println("Category : " + category);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Sugar Free : " + isSugarFree);

        System.out.println("-----------------------------");
    }
}