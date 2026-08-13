class Rocket {

    String name;
    String country;
    String fuelType;
    double height;
    double weight;
    String manufacturer;
    String launchSite;
    int stages;
    double speed;
    boolean reusable;


    Rocket() {

    }


    Rocket(String name) {

        this.name = name;
    }


    Rocket(String name, String country) {

        this.name = name;
        this.country = country;
    }


    Rocket(String name, String country, String fuelType) {

        this.name = name;
        this.country = country;
        this.fuelType = fuelType;
    }


    Rocket(String name, String country, String fuelType,
           double height) {

        this.name = name;
        this.country = country;
        this.fuelType = fuelType;
        this.height = height;
    }


    Rocket(String name, String country, String fuelType,
           double height, double weight) {

        this.name = name;
        this.country = country;
        this.fuelType = fuelType;
        this.height = height;
        this.weight = weight;
    }


    Rocket(String name, String country, String fuelType,
           double height, double weight, String manufacturer) {

        this.name = name;
        this.country = country;
        this.fuelType = fuelType;
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
    }


    Rocket(String name, String country, String fuelType,
           double height, double weight, String manufacturer,
           String launchSite) {

        this.name = name;
        this.country = country;
        this.fuelType = fuelType;
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.launchSite = launchSite;
    }


    Rocket(String name, String country, String fuelType,
           double height, double weight, String manufacturer,
           String launchSite, int stages) {

        this.name = name;
        this.country = country;
        this.fuelType = fuelType;
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.launchSite = launchSite;
        this.stages = stages;
    }


    Rocket(String name, String country, String fuelType,
           double height, double weight, String manufacturer,
           String launchSite, int stages, double speed) {

        this.name = name;
        this.country = country;
        this.fuelType = fuelType;
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.launchSite = launchSite;
        this.stages = stages;
        this.speed = speed;
    }


    Rocket(String name, String country, String fuelType,
           double height, double weight, String manufacturer,
           String launchSite, int stages, double speed,
           boolean reusable) {

        this.name = name;
        this.country = country;
        this.fuelType = fuelType;
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.launchSite = launchSite;
        this.stages = stages;
        this.speed = speed;
        this.reusable = reusable;
    }


    Rocket(String name, String country, String fuelType,
           double height, double weight, String manufacturer,
           String launchSite, int stages, double speed,
           boolean reusable, int extraValue) {

        this.name = name;
        this.country = country;
        this.fuelType = fuelType;
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.launchSite = launchSite;
        this.stages = stages;
        this.speed = speed;
        this.reusable = reusable;
    }


    void displayInfo() {

        System.out.println("Name : " + name);
        System.out.println("Country : " + country);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Launch Site : " + launchSite);
        System.out.println("Stages : " + stages);
        System.out.println("Speed : " + speed);
        System.out.println("Reusable : " + reusable);

        System.out.println("-----------------------------");
    }
}