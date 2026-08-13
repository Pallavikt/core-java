class SoftDrinkRunner {

    public static void main(String[] args) {

        SoftDrink drink1 = new SoftDrink();

        SoftDrink drink2 = new SoftDrink(
                "Coca-Cola"
        );

        SoftDrink drink3 = new SoftDrink(
                "Coca-Cola", "Coke"
        );

        SoftDrink drink4 = new SoftDrink(
                "Coca-Cola", "Coke", "Cola"
        );

        SoftDrink drink5 = new SoftDrink(
                "Coca-Cola", "Coke", "Cola",
                "750ml"
        );

        SoftDrink drink6 = new SoftDrink(
                "Coca-Cola", "Coke", "Cola",
                "750ml", 45
        );

        SoftDrink drink7 = new SoftDrink(
                "Coca-Cola", "Coke", "Cola",
                "750ml", 45, "Black"
        );

        SoftDrink drink8 = new SoftDrink(
                "Coca-Cola", "Coke", "Cola",
                "750ml", 45, "Black",
                "Bottle"
        );

        SoftDrink drink9 = new SoftDrink(
                "Coca-Cola", "Coke", "Cola",
                "750ml", 45, "Black",
                "Bottle", 1
        );

        SoftDrink drink10 = new SoftDrink(
                "Coca-Cola", "Coke", "Cola",
                "750ml", 45, "Black",
                "Bottle", 1, "Coca-Cola"
        );

        SoftDrink drink11 = new SoftDrink(
                "Coca-Cola", "Coke", "Cola",
                "750ml", 45, "Black",
                "Bottle", 1, "Coca-Cola", true
        );

        SoftDrink drink12 = new SoftDrink(
                "Coca-Cola", "Coke", "Cola",
                "750ml", 45, "Black",
                "Bottle", 1, "Coca-Cola", true, 10
        );


        drink1.displayInfo();
        drink2.displayInfo();
        drink3.displayInfo();
        drink4.displayInfo();
        drink5.displayInfo();
        drink6.displayInfo();
        drink7.displayInfo();
        drink8.displayInfo();
        drink9.displayInfo();
        drink10.displayInfo();
        drink11.displayInfo();
        drink12.displayInfo();

    }
}