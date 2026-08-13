class XeroxRunner {

    public static void main(String[] args) {

        Xerox xerox1 = new Xerox();

        Xerox xerox2 = new Xerox(
                "Canon"
        );

        Xerox xerox3 = new Xerox(
                "Canon", "IR 2004"
        );

        Xerox xerox4 = new Xerox(
                "Canon", "IR 2004", "White"
        );

        Xerox xerox5 = new Xerox(
                "Canon", "IR 2004", "White",
                "Laser"
        );

        Xerox xerox6 = new Xerox(
                "Canon", "IR 2004", "White",
                "Laser", 45000
        );

        Xerox xerox7 = new Xerox(
                "Canon", "IR 2004", "White",
                "Laser", 45000, 20
        );

        Xerox xerox8 = new Xerox(
                "Canon", "IR 2004", "White",
                "Laser", 45000, 20, "A4"
        );

        Xerox xerox9 = new Xerox(
                "Canon", "IR 2004", "White",
                "Laser", 45000, 20, "A4",
                "WiFi"
        );

        Xerox xerox10 = new Xerox(
                "Canon", "IR 2004", "White",
                "Laser", 45000, 20, "A4",
                "WiFi", 250
        );

        Xerox xerox11 = new Xerox(
                "Canon", "IR 2004", "White",
                "Laser", 45000, 20, "A4",
                "WiFi", 250, true
        );

        Xerox xerox12 = new Xerox(
                "Canon", "IR 2004", "White",
                "Laser", 45000, 20, "A4",
                "WiFi", 250, true, 10
        );


        xerox1.displayInfo();
        xerox2.displayInfo();
        xerox3.displayInfo();
        xerox4.displayInfo();
        xerox5.displayInfo();
        xerox6.displayInfo();
        xerox7.displayInfo();
        xerox8.displayInfo();
        xerox9.displayInfo();
        xerox10.displayInfo();
        xerox11.displayInfo();
        xerox12.displayInfo();

    }
}