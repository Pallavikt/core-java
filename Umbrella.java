class Umbrella {

    String brand;
    String color;
    String type;
    String material;
    double price;
    double size;
    String handleType;
    String openingType;
    String gender;
    boolean isWindProof;


    Umbrella() {

    }


    Umbrella(String brand) {

        this.brand = brand;
    }


    Umbrella(String brand, String color) {

        this.brand = brand;
        this.color = color;
    }


    Umbrella(String brand, String color, String type) {

        this.brand = brand;
        this.color = color;
        this.type = type;
    }


    Umbrella(String brand, String color, String type,
             String material) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
    }


    Umbrella(String brand, String color, String type,
             String material, double price) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
        this.price = price;
    }


    Umbrella(String brand, String color, String type,
             String material, double price, double size) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
        this.price = price;
        this.size = size;
    }


    Umbrella(String brand, String color, String type,
             String material, double price, double size,
             String handleType) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
        this.price = price;
        this.size = size;
        this.handleType = handleType;
    }


    Umbrella(String brand, String color, String type,
             String material, double price, double size,
             String handleType, String openingType) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
        this.price = price;
        this.size = size;
        this.handleType = handleType;
        this.openingType = openingType;
    }


    Umbrella(String brand, String color, String type,
             String material, double price, double size,
             String handleType, String openingType,
             String gender) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
        this.price = price;
        this.size = size;
        this.handleType = handleType;
        this.openingType = openingType;
        this.gender = gender;
    }


    Umbrella(String brand, String color, String type,
             String material, double price, double size,
             String handleType, String openingType,
             String gender, boolean isWindProof) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
        this.price = price;
        this.size = size;
        this.handleType = handleType;
        this.openingType = openingType;
        this.gender = gender;
        this.isWindProof = isWindProof;
    }


    Umbrella(String brand, String color, String type,
             String material, double price, double size,
             String handleType, String openingType,
             String gender, boolean isWindProof,
             int extraValue) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
        this.price = price;
        this.size = size;
        this.handleType = handleType;
        this.openingType = openingType;
        this.gender = gender;
        this.isWindProof = isWindProof;
    }


    void displayInfo() {

        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Type : " + type);
        System.out.println("Material : " + material);
        System.out.println("Price : " + price);
        System.out.println("Size : " + size);
        System.out.println("Handle Type : " + handleType);
        System.out.println("Opening Type : " + openingType);
        System.out.println("Gender : " + gender);
        System.out.println("Wind Proof : " + isWindProof);

        System.out.println("-----------------------------");
    }
}