class Xerox {

    String brand;
    String model;
    String color;
    String type;
    double price;
    int speed;
    String paperSize;
    String connectivity;
    int paperCapacity;
    boolean isColorPrinting;


    Xerox() {

    }


    Xerox(String brand) {

        this.brand = brand;
    }


    Xerox(String brand, String model) {

        this.brand = brand;
        this.model = model;
    }


    Xerox(String brand, String model, String color) {

        this.brand = brand;
        this.model = model;
        this.color = color;
    }


    Xerox(String brand, String model, String color, String type) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
    }


    Xerox(String brand, String model, String color,
          String type, double price) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
    }


    Xerox(String brand, String model, String color,
          String type, double price, int speed) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
        this.speed = speed;
    }


    Xerox(String brand, String model, String color,
          String type, double price, int speed,
          String paperSize) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
    }


    Xerox(String brand, String model, String color,
          String type, double price, int speed,
          String paperSize, String connectivity) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
        this.connectivity = connectivity;
    }


    Xerox(String brand, String model, String color,
          String type, double price, int speed,
          String paperSize, String connectivity,
          int paperCapacity) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
        this.connectivity = connectivity;
        this.paperCapacity = paperCapacity;
    }


    Xerox(String brand, String model, String color,
          String type, double price, int speed,
          String paperSize, String connectivity,
          int paperCapacity, boolean isColorPrinting) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
        this.connectivity = connectivity;
        this.paperCapacity = paperCapacity;
        this.isColorPrinting = isColorPrinting;
    }


    Xerox(String brand, String model, String color,
          String type, double price, int speed,
          String paperSize, String connectivity,
          int paperCapacity, boolean isColorPrinting,
          int extraValue) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
        this.connectivity = connectivity;
        this.paperCapacity = paperCapacity;
        this.isColorPrinting = isColorPrinting;
    }


    void displayInfo() {

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Type : " + type);
        System.out.println("Price : " + price);
        System.out.println("Speed : " + speed);
        System.out.println("Paper Size : " + paperSize);
        System.out.println("Connectivity : " + connectivity);
        System.out.println("Paper Capacity : " + paperCapacity);
        System.out.println("Color Printing : " + isColorPrinting);

        System.out.println("-----------------------------");
    }
}