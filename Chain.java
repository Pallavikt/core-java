class Chain {

    String material;
    String color;
    double price;
    String brand;
    String design;
    String length;
    String weight;
    String type;
    String occasion;
    boolean isHallmarked;

    Chain(String material, String color, double price,
          String brand, String design, String length,
          String weight, String type, String occasion,
          boolean isHallmarked) {

        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
        this.length = length;
        this.weight = weight;
        this.type = type;
        this.occasion = occasion;
        this.isHallmarked = isHallmarked;
    }

    void displayInfo() {

        System.out.println("Material : " + material);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Brand : " + brand);
        System.out.println("Design : " + design);
        System.out.println("Length : " + length);
        System.out.println("Weight : " + weight);
        System.out.println("Type : " + type);
        System.out.println("Occasion : " + occasion);
        System.out.println("Hallmarked : " + isHallmarked);
        System.out.println("-----------------------------");
    }
}