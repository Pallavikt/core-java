class BoomerRunner {

    public static void main(String[] args) {

        Boomer boomer1 = new Boomer(
            "Boomer", "Strawberry", "Pink", 10,
            "Round", "Packet", 10, "Chewing Gum",
            "Perfetti Van Melle", false
        );

        Boomer boomer2 = new Boomer(
            "Boomer", "Mango", "Yellow", 20,
            "Round", "Box", 20, "Chewing Gum",
            "Perfetti Van Melle", false
        );

        Boomer boomer3 = new Boomer(
            "Boomer", "Mint", "Green", 15,
            "Round", "Packet", 15, "Chewing Gum",
            "Perfetti Van Melle", true
        );

        boomer1.displayInfo();
        boomer2.displayInfo();
        boomer3.displayInfo();
    }
}