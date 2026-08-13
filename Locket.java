class Locket {

    String material;
    String shape;
    String color;
    double price;
    String brand;
    String design;
    String size;
    String occasion;
    String gender;
    boolean isGoldPlated;


    Locket() {

    }


    Locket(String material) {

        this.material = material;
    }


    Locket(String material, String shape) {

        this.material = material;
        this.shape = shape;
    }


    Locket(String material, String shape, String color) {

        this.material = material;
        this.shape = shape;
        this.color = color;
    }


    Locket(String material, String shape, String color, double price) {

        this.material = material;
        this.shape = shape;
        this.color = color;
        this.price = price;
    }


    Locket(String material, String shape, String color,
           double price, String brand) {

        this.material = material;
        this.shape = shape;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }


    Locket(String material, String shape, String color,
           double price, String brand, String design) {

        this.material = material;
        this.shape = shape;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
    }


    Locket(String material, String shape, String color,
           double price, String brand, String design, String size) {

        this.material = material;
        this.shape = shape;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
        this.size = size;
    }


    Locket(String material, String shape, String color,
           double price, String brand, String design,
           String size, String occasion) {

        this.material = material;
        this.shape = shape;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
        this.size = size;
        this.occasion = occasion;
    }


    Locket(String material, String shape, String color,
           double price, String brand, String design,
           String size, String occasion, String gender) {

        this.material = material;
        this.shape = shape;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
        this.size = size;
        this.occasion = occasion;
        this.gender = gender;
    }


    Locket(String material, String shape, String color,
           double price, String brand, String design,
           String size, String occasion, String gender,
           boolean isGoldPlated) {

        this.material = material;
        this.shape = shape;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
        this.size = size;
        this.occasion = occasion;
        this.gender = gender;
        this.isGoldPlated = isGoldPlated;
    }


    Locket(String material, String shape, String color,
           double price, String brand, String design,
           String size, String occasion, String gender,
           boolean isGoldPlated, int extraValue) {

        this.material = material;
        this.shape = shape;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.design = design;
        this.size = size;
        this.occasion = occasion;
        this.gender = gender;
        this.isGoldPlated = isGoldPlated;
    }


    void displayInfo() {

        System.out.println("Material : " + material);
        System.out.println("Shape : " + shape);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Brand : " + brand);
        System.out.println("Design : " + design);
        System.out.println("Size : " + size);
        System.out.println("Occasion : " + occasion);
        System.out.println("Gender : " + gender);
        System.out.println("Gold Plated : " + isGoldPlated);

        System.out.println("-----------------------------");
    }
}