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


    Chain() {

    }


    Chain(String material) {

        this.material = material;
    }


    Chain(String material, String color) {

        this.material = material;
        this.color = color;
    }


    Chain(String material, String color, double price) {

        this.material = material;
        this.color = color;
        this.price = price;
    }


    Chain(String material, String color, double price,
          String brand) {

        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }


    Chain(String material, String color, double price,
          String brand, String design) {

        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
    }


    Chain(String material, String color, double price,
          String brand, String design, String length) {

        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
        this.length = length;
    }


    Chain(String material, String color, double price,
          String brand, String design, String length,
          String weight) {

        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
        this.length = length;
        this.weight = weight;
    }


    Chain(String material, String color, double price,
          String brand, String design, String length,
          String weight, String type) {

        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
        this.length = length;
        this.weight = weight;
        this.type = type;
    }


    Chain(String material, String color, double price,
          String brand, String design, String length,
          String weight, String type, String occasion) {

        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
        this.length = length;
        this.weight = weight;
        this.type = type;
        this.occasion = occasion;
    }


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


    Chain(String material, String color, double price,
          String brand, String design, String length,
          String weight, String type, String occasion,
          boolean isHallmarked, int extraValue) {

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