class Karnataka {
static String stateName = "Karnataka";

    public static void main(String[] karnataka) {
        String[] airports = {
        "Kempegowda International Airport, Bengaluru",
        "Mysuru Airport",
        "Mangaluru International Airport",
        "Hubballi Airport",
        "Belagavi Airport",
        "Kalaburagi Airport",
        "Bidar Airport",
        "Shivamogga Airport",
        "Vijayanagara Airport (Jindal Vijaynagar Airport, Toranagallu)",
        "HAL Airport, Bengaluru"};

        System.out.println("State Name : " + stateName);
		
		System.out.println(" ");

        System.out.println("Airports in Karnataka:");

        for (String airport : airports) {
            System.out.println(airport);
        }
    }

}