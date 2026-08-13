class Specs {

    String brand;
    String frameColor;
    String frameMaterial;
    String lensType;
    String lensColor;
    double price;
    String shape;
    String size;
    String gender;
    boolean isPowerGlass;


    Specs() {

    }


    Specs(String brand) {

        this.brand = brand;
    }


    Specs(String brand, String frameColor) {

        this.brand = brand;
        this.frameColor = frameColor;
    }


    Specs(String brand, String frameColor, String frameMaterial) {

        this.brand = brand;
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
    }


    Specs(String brand, String frameColor, String frameMaterial,
          String lensType) {

        this.brand = brand;
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
        this.lensType = lensType;
    }


    Specs(String brand, String frameColor, String frameMaterial,
          String lensType, String lensColor) {

        this.brand = brand;
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
        this.lensType = lensType;
        this.lensColor = lensColor;
    }


    Specs(String brand, String frameColor, String frameMaterial,
          String lensType, String lensColor, double price) {

        this.brand = brand;
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
        this.lensType = lensType;
        this.lensColor = lensColor;
        this.price = price;
    }


    Specs(String brand, String frameColor, String frameMaterial,
          String lensType, String lensColor, double price,
          String shape) {

        this.brand = brand;
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
        this.lensType = lensType;
        this.lensColor = lensColor;
        this.price = price;
        this.shape = shape;
    }


    Specs(String brand, String frameColor, String frameMaterial,
          String lensType, String lensColor, double price,
          String shape, String size) {

        this.brand = brand;
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
        this.lensType = lensType;
        this.lensColor = lensColor;
        this.price = price;
        this.shape = shape;
        this.size = size;
    }


    Specs(String brand, String frameColor, String frameMaterial,
          String lensType, String lensColor, double price,
          String shape, String size, String gender) {

        this.brand = brand;
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
        this.lensType = lensType;
        this.lensColor = lensColor;
        this.price = price;
        this.shape = shape;
        this.size = size;
        this.gender = gender;
    }


    Specs(String brand, String frameColor, String frameMaterial,
          String lensType, String lensColor, double price,
          String shape, String size, String gender,
          boolean isPowerGlass) {

        this.brand = brand;
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
        this.lensType = lensType;
        this.lensColor = lensColor;
        this.price = price;
        this.shape = shape;
        this.size = size;
        this.gender = gender;
        this.isPowerGlass = isPowerGlass;
    }


    Specs(String brand, String frameColor, String frameMaterial,
          String lensType, String lensColor, double price,
          String shape, String size, String gender,
          boolean isPowerGlass, int extraValue) {

        this.brand = brand;
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
        this.lensType = lensType;
        this.lensColor = lensColor;
        this.price = price;
        this.shape = shape;
        this.size = size;
        this.gender = gender;
        this.isPowerGlass = isPowerGlass;
    }


    void displayInfo() {

        System.out.println("Brand          : " + brand);
        System.out.println("Frame Color    : " + frameColor);
        System.out.println("Frame Material : " + frameMaterial);
        System.out.println("Lens Type      : " + lensType);
        System.out.println("Lens Color     : " + lensColor);
        System.out.println("Price          : " + price);
        System.out.println("Shape          : " + shape);
        System.out.println("Size           : " + size);
        System.out.println("Gender         : " + gender);
        System.out.println("Power Glass    : " + isPowerGlass);

        System.out.println("-----------------------------");
    }
}