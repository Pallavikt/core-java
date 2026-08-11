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