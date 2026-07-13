class Max{

    public static void createProfile(String firstName,String lastName){
		
		if(firstName != null){
			
		System.out.println("First Name: "+ firstName);
		
		}
		
		else{
			
			System.out.println("Invalid First Name!");
			
		}
		
		if(lastName != null){
			
		System.out.println("Last Name: "+lastName);
		
		}
		
		else{
			
			System.out.println("Invalid Last Name!");
			
		}
		
	}
	
	      public static void main(String[] args){
			  
			  createProfile("pallavi", null);
			  
		    }
			
}