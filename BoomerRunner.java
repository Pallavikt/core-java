class BoomerRunner {

    public static void main(String[] args) {

        Boomer boomer1 = new Boomer();

        Boomer boomer2 = new Boomer(
                "Boomer"
        );

        Boomer boomer3 = new Boomer(
                "Boomer", "Strawberry"
        );

        Boomer boomer4 = new Boomer(
                "Boomer", "Strawberry", "Pink"
        );

        Boomer boomer5 = new Boomer(
                "Boomer", "Strawberry", "Pink", 10
        );

        Boomer boomer6 = new Boomer(
                "Boomer", "Strawberry", "Pink", 10,
                "Round"
        );

        Boomer boomer7 = new Boomer(
                "Boomer", "Strawberry", "Pink", 10,
                "Round", "Packet"
        );

        Boomer boomer8 = new Boomer(
                "Boomer", "Strawberry", "Pink", 10,
                "Round", "Packet", 10
        );

        Boomer boomer9 = new Boomer(
                "Boomer", "Strawberry", "Pink", 10,
                "Round", "Packet", 10,
                "Chewing Gum"
        );

        Boomer boomer10 = new Boomer(
                "Boomer", "Strawberry", "Pink", 10,
                "Round", "Packet", 10,
                "Chewing Gum", "Perfetti Van Melle"
        );

        Boomer boomer11 = new Boomer(
                "Boomer", "Strawberry", "Pink", 10,
                "Round", "Packet", 10,
                "Chewing Gum", "Perfetti Van Melle", false
        );

        Boomer boomer12 = new Boomer(
                "Boomer", "Strawberry", "Pink", 10,
                "Round", "Packet", 10,
                "Chewing Gum", "Perfetti Van Melle", false, 10
        );


        boomer1.displayInfo();
        boomer2.displayInfo();
        boomer3.displayInfo();
        boomer4.displayInfo();
        boomer5.displayInfo();
        boomer6.displayInfo();
        boomer7.displayInfo();
        boomer8.displayInfo();
        boomer9.displayInfo();
        boomer10.displayInfo();
        boomer11.displayInfo();
        boomer12.displayInfo();

    }
}