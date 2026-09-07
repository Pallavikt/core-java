class ShoppingRunner{
	
	public static void main(String[] a){
		
		System.out.println("Main Started");
		
		Shopping shopping = new Shopping();
		shopping.purchase();
		
		System.out.println("_________________________");
		
		Shopping shop = new OnlineShopping();
		shop.purchase();
		
		System.out.println("Main Ended");
	}
	
	
}