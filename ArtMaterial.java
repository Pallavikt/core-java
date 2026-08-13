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


    ArtMaterial() {

    }


    ArtMaterial(String name) {

        this.name = name;
    }


    ArtMaterial(String name, String brand) {

        this.name = name;
        this.brand = brand;
    }


    ArtMaterial(String name, String brand, String type) {

        this.name = name;
        this.brand = brand;
        this.type = type;
    }


    ArtMaterial(String name, String brand, String type,
                String color) {

        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
    }


    ArtMaterial(String name, String brand, String type,
                String color, double price) {

        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }


    ArtMaterial(String name, String brand, String type,
                String color, double price, int quantity) {

        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }


    ArtMaterial(String name, String brand, String type,
                String color, double price, int quantity,
                String material) {

        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
    }


    ArtMaterial(String name, String brand, String type,
                String color, double price, int quantity,
                String material, String size) {

        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.size = size;
    }


    ArtMaterial(String name, String brand, String type,
                String color, double price, int quantity,
                String material, String size, String usage) {

        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.size = size;
        this.usage = usage;
    }


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


    ArtMaterial(String name, String brand, String type,
                String color, double price, int quantity,
                String material, String size, String usage,
                boolean isWaterProof, int extraValue) {

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