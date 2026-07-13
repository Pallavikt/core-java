class HeadSet{

   static boolean isConnected;
   
       public static void OnOrOff(){
		   
		   if(isConnected == false){
			   
			   isConnected = true;
			   
			   System.out.println("Headset is Connected!");
			   
		   }else{
			   
			   isConnected = false;
			   
			   System.out.println("Headset is Disconnected!");
			   
		    }
	   }
	   
	      public static void main(String[] a){
			  
			  System.out.println(isConnected);
			  
			  OnOrOff();
			  
			  System.out.println(isConnected);
			  
		  }
		  
		  
}