class District {

    public static void run() {

        System.out.println("run Started");

        taxing();

        System.out.println("run Ended");
    }

    public static void taxing() {

        System.out.println("taxing Started");

        measure();

        System.out.println("taxing Ended");
    }

    public static void measure() {

        System.out.println("measure Started");

        collect();

        System.out.println("measure Ended");
    }

    public static void collect() {

        System.out.println("collect Started");

        revenue();

        System.out.println("collect Ended");
    }

    public static void revenue() {

        System.out.println("revenue Started");

        budget();

        System.out.println("revenue Ended");
    }

    public static void budget() {

        System.out.println("budget Started");

        System.out.println("budget Ended");
    }
}