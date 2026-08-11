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