class InkPadRunner {

    public static void main(String[] args) {

        InkPad pad1 = new InkPad(
            "Camlin", "Blue", "Water Based", "Medium",
            50, "Foam", "Square", "Office",
            "Kokuyo Camlin", false
        );

        InkPad pad2 = new InkPad(
            "Kores", "Black", "Oil Based", "Large",
            80, "Foam", "Square", "Official",
            "Kores", true
        );

        InkPad pad3 = new InkPad(
            "Brustro", "Red", "Water Based", "Small",
            40, "Foam", "Round", "Art",
            "Brustro", false
        );

        pad1.displayInfo();
        pad2.displayInfo();
        pad3.displayInfo();
    }
}