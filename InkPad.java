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