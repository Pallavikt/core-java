class Swiggy{

    public static double search(String item){
	
	   double price = 0.0;
	   
	   if(item == "Pizza"){
		   
		   price = 69.00;
		  
	   }else if(item == "Burger"){
		   
		   price = 119.00;
		   
	   }else if(item == "Mushroom Biryani"){
		   
		   price = 280.00;
		   
	    }else if(item == "Sandwitch"){
			
			price = 65.00;
			
		}
		
		return price;
		
	}
	
	   public static void main(String[] args){
		   
		  String itemName = "Mushroom Biryani";
		  
		  double price = search(itemName);
		  
		  System.out.println("The price of " + itemName + " is " + price);

	    } 
		
}