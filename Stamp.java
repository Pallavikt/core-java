class Stamp {

    String design;
    String color;
    String material;
    String type;
    double price;
    String size;
    String shape;
    String usage;
    String handleMaterial;
    boolean isSelfInking;


    Stamp() {

    }


    Stamp(String design) {

        this.design = design;
    }


    Stamp(String design, String color) {

        this.design = design;
        this.color = color;
    }


    Stamp(String design, String color, String material) {

        this.design = design;
        this.color = color;
        this.material = material;
    }


    Stamp(String design, String color, String material,
          String type) {

        this.design = design;
        this.color = color;
        this.material = material;
        this.type = type;
    }


    Stamp(String design, String color, String material,
          String type, double price) {

        this.design = design;
        this.color = color;
        this.material = material;
        this.type = type;
        this.price = price;
    }


    Stamp(String design, String color, String material,
          String type, double price, String size) {

        this.design = design;
        this.color = color;
        this.material = material;
        this.type = type;
        this.price = price;
        this.size = size;
    }


    Stamp(String design, String color, String material,
          String type, double price, String size,
          String shape) {

        this.design = design;
        this.color = color;
        this.material = material;
        this.type = type;
        this.price = price;
        this.size = size;
        this.shape = shape;
    }


    Stamp(String design, String color, String material,
          String type, double price, String size,
          String shape, String usage) {

        this.design = design;
        this.color = color;
        this.material = material;
        this.type = type;
        this.price = price;
        this.size = size;
        this.shape = shape;
        this.usage = usage;
    }


    Stamp(String design, String color, String material,
          String type, double price, String size,
          String shape, String usage, String handleMaterial) {

        this.design = design;
        this.color = color;
        this.material = material;
        this.type = type;
        this.price = price;
        this.size = size;
        this.shape = shape;
        this.usage = usage;
        this.handleMaterial = handleMaterial;
    }


    Stamp(String design, String color, String material,
          String type, double price, String size,
          String shape, String usage, String handleMaterial,
          boolean isSelfInking) {

        this.design = design;
        this.color = color;
        this.material = material;
        this.type = type;
        this.price = price;
        this.size = size;
        this.shape = shape;
        this.usage = usage;
        this.handleMaterial = handleMaterial;
        this.isSelfInking = isSelfInking;
    }


    Stamp(String design, String color, String material,
          String type, double price, String size,
          String shape, String usage, String handleMaterial,
          boolean isSelfInking, int extraValue) {

        this.design = design;
        this.color = color;
        this.material = material;
        this.type = type;
        this.price = price;
        this.size = size;
        this.shape = shape;
        this.usage = usage;
        this.handleMaterial = handleMaterial;
        this.isSelfInking = isSelfInking;
    }


    void displayInfo() {

        System.out.println("Design : " + design);
        System.out.println("Color : " + color);
        System.out.println("Material : " + material);
        System.out.println("Type : " + type);
        System.out.println("Price : " + price);
        System.out.println("Size : " + size);
        System.out.println("Shape : " + shape);
        System.out.println("Usage : " + usage);
        System.out.println("Handle Material : " + handleMaterial);
        System.out.println("Self Inking : " + isSelfInking);

        System.out.println("-----------------------------");
    }
}