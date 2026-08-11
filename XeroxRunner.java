class XeroxRunner {

    public static void main(String[] args) {

        Xerox xerox1 = new Xerox(
            "Canon", "IR 2004", "White", "Laser",
            45000, 20, "A4", "WiFi",
            250, true
        );

        Xerox xerox2 = new Xerox(
            "HP", "LaserJet", "Black", "Laser",
            35000, 25, "A4", "USB",
            200, true
        );

        Xerox xerox3 = new Xerox(
            "Brother", "DCP", "White", "Multifunction",
            50000, 30, "A3", "WiFi",
            300, true
        );

        xerox1.displayInfo();
        xerox2.displayInfo();
        xerox3.displayInfo();
    }
}