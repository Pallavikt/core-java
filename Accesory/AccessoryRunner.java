class AccessoryRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");
		
		Accessory accessory = new Accessory();
		accessory.wear();

        Accessory a = new Chain(); //Polymorphism
        a.wear(); // Run Time Polymorphism

        System.out.println("Main Ended");
    }
}