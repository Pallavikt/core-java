class ThinkPadRunner {

    public static void main(String[] args) {

        ThinkPad laptop1 = new ThinkPad(
            "Lenovo", "ThinkPad E14", "Intel Core i5",
            16, 512, 65000, "14 inch FHD",
            "Windows 11", "Black", false
        );

        ThinkPad laptop2 = new ThinkPad(
            "Lenovo", "ThinkPad T14", "Intel Core i7",
            16, 1024, 95000, "14 inch WUXGA",
            "Windows 11", "Black", false
        );

        ThinkPad laptop3 = new ThinkPad(
            "Lenovo", "ThinkPad X1 Carbon", "Intel Core i7",
            32, 1024, 135000, "14 inch OLED",
            "Windows 11", "Black", true
        );

        laptop1.displayInfo();
        laptop2.displayInfo();
        laptop3.displayInfo();
    }
}