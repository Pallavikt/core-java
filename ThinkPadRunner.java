class ThinkPadRunner {

    public static void main(String[] args) {

        ThinkPad thinkPad1 = new ThinkPad();

        ThinkPad thinkPad2 = new ThinkPad(
                "Lenovo"
        );

        ThinkPad thinkPad3 = new ThinkPad(
                "Lenovo", "ThinkPad E14"
        );

        ThinkPad thinkPad4 = new ThinkPad(
                "Lenovo", "ThinkPad E14",
                "Intel Core i5"
        );

        ThinkPad thinkPad5 = new ThinkPad(
                "Lenovo", "ThinkPad E14",
                "Intel Core i5", 16
        );

        ThinkPad thinkPad6 = new ThinkPad(
                "Lenovo", "ThinkPad E14",
                "Intel Core i5", 16, 512
        );

        ThinkPad thinkPad7 = new ThinkPad(
                "Lenovo", "ThinkPad E14",
                "Intel Core i5", 16, 512,
                65000
        );

        ThinkPad thinkPad8 = new ThinkPad(
                "Lenovo", "ThinkPad E14",
                "Intel Core i5", 16, 512,
                65000, "14 inch"
        );

        ThinkPad thinkPad9 = new ThinkPad(
                "Lenovo", "ThinkPad E14",
                "Intel Core i5", 16, 512,
                65000, "14 inch", "Windows 11"
        );

        ThinkPad thinkPad10 = new ThinkPad(
                "Lenovo", "ThinkPad E14",
                "Intel Core i5", 16, 512,
                65000, "14 inch", "Windows 11",
                "Black"
        );

        ThinkPad thinkPad11 = new ThinkPad(
                "Lenovo", "ThinkPad E14",
                "Intel Core i5", 16, 512,
                65000, "14 inch", "Windows 11",
                "Black", false
        );

        ThinkPad thinkPad12 = new ThinkPad(
                "Lenovo", "ThinkPad E14",
                "Intel Core i5", 16, 512,
                65000, "14 inch", "Windows 11",
                "Black", false, 10
        );


        thinkPad1.displayInfo();
        thinkPad2.displayInfo();
        thinkPad3.displayInfo();
        thinkPad4.displayInfo();
        thinkPad5.displayInfo();
        thinkPad6.displayInfo();
        thinkPad7.displayInfo();
        thinkPad8.displayInfo();
        thinkPad9.displayInfo();
        thinkPad10.displayInfo();
        thinkPad11.displayInfo();
        thinkPad12.displayInfo();

    }
}