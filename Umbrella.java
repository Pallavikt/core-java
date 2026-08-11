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