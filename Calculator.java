class Calculator{

      public static void add(int first,int second){
		  
		  int total = first+second; 
		  System.out.println(total);
		  
	    }
		
	    public static void substract(int first,int second){
			
			int total = first-second;
			System.out.println(total);
		}
		
		public static void multiply(int first,int second){
			int result = first*second;
			System.out.println(result);
		}
		
		public static void divide(int first,int second){
			int num = first/second;
			System.out.println(num);
		}
		
		public static void mod(int first,int second){
			int modulus = first%second;
			System.out.println(modulus);
		}
		
		       public static void main(String[] calci){
			   
			       add(120,27);
				   substract(238,130);
				   multiply(14,3);
				   divide(280,4);
				   mod(20,2);
		        }
			
}


//watch - getBrand,getPrice,getColor,getOperatingSystem,getCaseMaterialType