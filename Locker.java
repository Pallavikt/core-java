class Locker {

    String brand;
    String material;
    String color;
    String type;
    double price;
    double height;
    double width;
    String lockType;
    int capacity;
    boolean isFireProof;


    Locker() {

    }


    Locker(String brand) {

        this.brand = brand;
    }


    Locker(String brand, String material) {

        this.brand = brand;
        this.material = material;
    }


    Locker(String brand, String material, String color) {

        this.brand = brand;
        this.material = material;
        this.color = color;
    }


    Locker(String brand, String material, String color, String type) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
    }


    Locker(String brand, String material, String color,
           String type, double price) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.price = price;
    }


    Locker(String brand, String material, String color,
           String type, double price, double height) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.price = price;
        this.height = height;
    }


    Locker(String brand, String material, String color,
           String type, double price, double height,
           double width) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.price = price;
        this.height = height;
        this.width = width;
    }


    Locker(String brand, String material, String color,
           String type, double price, double height,
           double width, String lockType) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.price = price;
        this.height = height;
        this.width = width;
        this.lockType = lockType;
    }


    Locker(String brand, String material, String color,
           String type, double price, double height,
           double width, String lockType, int capacity) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.price = price;
        this.height = height;
        this.width = width;
        this.lockType = lockType;
        this.capacity = capacity;
    }


    Locker(String brand, String material, String color,
           String type, double price, double height,
           double width, String lockType, int capacity,
           boolean isFireProof) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.price = price;
        this.height = height;
        this.width = width;
        this.lockType = lockType;
        this.capacity = capacity;
        this.isFireProof = isFireProof;
    }


    Locker(String brand, String material, String color,
           String type, double price, double height,
           double width, String lockType, int capacity,
           boolean isFireProof, int extraValue) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.price = price;
        this.height = height;
        this.width = width;
        this.lockType = lockType;
        this.capacity = capacity;
        this.isFireProof = isFireProof;
    }


    void displayInfo() {

        System.out.println("Brand : " + brand);
        System.out.println("Material : " + material);
        System.out.println("Color : " + color);
        System.out.println("Type : " + type);
        System.out.println("Price : " + price);
        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Lock Type : " + lockType);
        System.out.println("Capacity : " + capacity);
        System.out.println("Fire Proof : " + isFireProof);

        System.out.println("-----------------------------");
    }
}