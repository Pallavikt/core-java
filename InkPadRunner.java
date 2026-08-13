class InkPadRunner {

    public static void main(String[] args) {

        InkPad pad1 = new InkPad();

        InkPad pad2 = new InkPad(
                "Camlin"
        );

        InkPad pad3 = new InkPad(
                "Camlin", "Blue"
        );

        InkPad pad4 = new InkPad(
                "Camlin", "Blue", "Water Based"
        );

        InkPad pad5 = new InkPad(
                "Camlin", "Blue", "Water Based",
                "Medium"
        );

        InkPad pad6 = new InkPad(
                "Camlin", "Blue", "Water Based",
                "Medium", 50
        );

        InkPad pad7 = new InkPad(
                "Camlin", "Blue", "Water Based",
                "Medium", 50, "Foam"
        );

        InkPad pad8 = new InkPad(
                "Camlin", "Blue", "Water Based",
                "Medium", 50, "Foam",
                "Square"
        );

        InkPad pad9 = new InkPad(
                "Camlin", "Blue", "Water Based",
                "Medium", 50, "Foam",
                "Square", "Office"
        );

        InkPad pad10 = new InkPad(
                "Camlin", "Blue", "Water Based",
                "Medium", 50, "Foam",
                "Square", "Office", "Kokuyo Camlin"
        );

        InkPad pad11 = new InkPad(
                "Camlin", "Blue", "Water Based",
                "Medium", 50, "Foam",
                "Square", "Office", "Kokuyo Camlin", false
        );

        InkPad pad12 = new InkPad(
                "Camlin", "Blue", "Water Based",
                "Medium", 50, "Foam",
                "Square", "Office", "Kokuyo Camlin", false, 10
        );


        pad1.displayInfo();
        pad2.displayInfo();
        pad3.displayInfo();
        pad4.displayInfo();
        pad5.displayInfo();
        pad6.displayInfo();
        pad7.displayInfo();
        pad8.displayInfo();
        pad9.displayInfo();
        pad10.displayInfo();
        pad11.displayInfo();
        pad12.displayInfo();

    }
}