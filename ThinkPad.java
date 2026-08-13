class ThinkPad {

    String brand;
    String model;
    String processor;
    int ram;
    int storage;
    double price;
    String display;
    String operatingSystem;
    String color;
    boolean isTouchScreen;


    ThinkPad() {

    }


    ThinkPad(String brand) {

        this.brand = brand;
    }


    ThinkPad(String brand, String model) {

        this.brand = brand;
        this.model = model;
    }


    ThinkPad(String brand, String model, String processor) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
    }


    ThinkPad(String brand, String model, String processor,
             int ram) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
    }


    ThinkPad(String brand, String model, String processor,
             int ram, int storage) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }


    ThinkPad(String brand, String model, String processor,
             int ram, int storage, double price) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }


    ThinkPad(String brand, String model, String processor,
             int ram, int storage, double price,
             String display) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.display = display;
    }


    ThinkPad(String brand, String model, String processor,
             int ram, int storage, double price,
             String display, String operatingSystem) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.display = display;
        this.operatingSystem = operatingSystem;
    }


    ThinkPad(String brand, String model, String processor,
             int ram, int storage, double price,
             String display, String operatingSystem,
             String color) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.display = display;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }


    ThinkPad(String brand, String model, String processor,
             int ram, int storage, double price,
             String display, String operatingSystem,
             String color, boolean isTouchScreen) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.display = display;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.isTouchScreen = isTouchScreen;
    }


    ThinkPad(String brand, String model, String processor,
             int ram, int storage, double price,
             String display, String operatingSystem,
             String color, boolean isTouchScreen,
             int extraValue) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.display = display;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.isTouchScreen = isTouchScreen;
    }


    void displayInfo() {

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Processor : " + processor);
        System.out.println("RAM : " + ram);
        System.out.println("Storage : " + storage);
        System.out.println("Price : " + price);
        System.out.println("Display : " + display);
        System.out.println("Operating System : " + operatingSystem);
        System.out.println("Color : " + color);
        System.out.println("Touch Screen : " + isTouchScreen);

        System.out.println("-----------------------------");
    }
}