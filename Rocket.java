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