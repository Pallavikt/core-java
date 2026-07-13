class Item {

    static String itemName = "Fair & Lovely (Glow & Lovely)";
    
	public static void main(String[] fairandlovely) {
			String[] ingredients = {
			"Water (Aqua)",
			"Glycerin",
			"Niacinamide (Vitamin B3)",
			"Stearic Acid",
			"Palmitic Acid",
			"Myristic Acid",
			"Potassium Hydroxide",
			"Titanium Dioxide",
			"Dimethicone",
			"Cetyl Alcohol",
			"Glycol Stearate",
			"Sodium Hydroxide",
			"Disodium EDTA",
			"Perfume (Fragrance)",
			"Allantoin",
			"Vitamin E",
			"Vitamin C",
			"Silica",
			"Sodium Chloride",
			"Phenoxyethanol"};
			
			System.out.println("Item Name : " + itemName);
			
			System.out.println(" ");

			System.out.println("Ingredients:");

			for (String ingredient : ingredients) {
				System.out.println(ingredient);
			}
    }

}