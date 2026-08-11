class ArtMaterial {

    String name;
    String brand;
    String type;
    String color;
    double price;
    int quantity;
    String material;
    String size;
    String usage;
    boolean isWaterProof;

    ArtMaterial(String name, String brand, String type,
                String color, double price, int quantity,
                String material, String size, String usage,
                boolean isWaterProof) {

        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.size = size;
        this.usage = usage;
        this.isWaterProof = isWaterProof;
    }

    void displayInfo() {

        System.out.println("Name : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Type : " + type);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Material : " + material);
        System.out.println("Size : " + size);
        System.out.println("Usage : " + usage);
        System.out.println("Water Proof : " + isWaterProof);
        System.out.println("-----------------------------");
    }
}