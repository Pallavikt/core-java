class SoftDrinkRunner {

    public static void main(String[] args) {

        SoftDrink drink1 = new SoftDrink(
            "Coca-Cola", "Coke", "Cola", "750ml",
            45, "Black", "Bottle", 1,
            "Coca-Cola", true
        );

        SoftDrink drink2 = new SoftDrink(
            "Pepsi", "Pepsi", "Cola", "500ml",
            40, "Black", "Bottle", 1,
            "PepsiCo", true
        );

        SoftDrink drink3 = new SoftDrink(
            "Sprite", "Sprite", "Lemon", "750ml",
            45, "Transparent", "Bottle", 1,
            "Coca-Cola", true
        );

        drink1.displayInfo();
        drink2.displayInfo();
        drink3.displayInfo();
    }
}