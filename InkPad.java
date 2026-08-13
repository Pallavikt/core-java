class InkPad {

    String brand;
    String color;
    String inkType;
    String padSize;
    double price;
    String material;
    String shape;
    String usage;
    String manufacturer;
    boolean isPermanent;


    InkPad() {

    }


    InkPad(String brand) {

        this.brand = brand;
    }


    InkPad(String brand, String color) {

        this.brand = brand;
        this.color = color;
    }


    InkPad(String brand, String color, String inkType) {

        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
    }


    InkPad(String brand, String color, String inkType,
           String padSize) {

        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.padSize = padSize;
    }


    InkPad(String brand, String color, String inkType,
           String padSize, double price) {

        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.padSize = padSize;
        this.price = price;
    }


    InkPad(String brand, String color, String inkType,
           String padSize, double price, String material) {

        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.padSize = padSize;
        this.price = price;
        this.material = material;
    }


    InkPad(String brand, String color, String inkType,
           String padSize, double price, String material,
           String shape) {

        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.padSize = padSize;
        this.price = price;
        this.material = material;
        this.shape = shape;
    }


    InkPad(String brand, String color, String inkType,
           String padSize, double price, String material,
           String shape, String usage) {

        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.padSize = padSize;
        this.price = price;
        this.material = material;
        this.shape = shape;
        this.usage = usage;
    }


    InkPad(String brand, String color, String inkType,
           String padSize, double price, String material,
           String shape, String usage, String manufacturer) {

        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.padSize = padSize;
        this.price = price;
        this.material = material;
        this.shape = shape;
        this.usage = usage;
        this.manufacturer = manufacturer;
    }


    InkPad(String brand, String color, String inkType,
           String padSize, double price, String material,
           String shape, String usage, String manufacturer,
           boolean isPermanent) {

        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.padSize = padSize;
        this.price = price;
        this.material = material;
        this.shape = shape;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.isPermanent = isPermanent;
    }


    InkPad(String brand, String color, String inkType,
           String padSize, double price, String material,
           String shape, String usage, String manufacturer,
           boolean isPermanent, int extraValue) {

        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.padSize = padSize;
        this.price = price;
        this.material = material;
        this.shape = shape;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.isPermanent = isPermanent;
    }


    void displayInfo() {

        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Ink Type : " + inkType);
        System.out.println("Pad Size : " + padSize);
        System.out.println("Price : " + price);
        System.out.println("Material : " + material);
        System.out.println("Shape : " + shape);
        System.out.println("Usage : " + usage);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Permanent : " + isPermanent);

        System.out.println("-----------------------------");
    }
}