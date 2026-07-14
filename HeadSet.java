class HeadSet{

   static boolean isConnected;
   
   static int currentVolume;
   
   static int maxVolume = 7;
   
   static int minVolume;
   
       public static void OnOrOff(){
		   
		   if(isConnected == false){
			   
			   isConnected = true;
			   
			   System.out.println("Headset is Turned ON! "+isConnected);
			   
		   }else{
			   
			   isConnected = false;
			   
			   System.out.println("Headset is Turned OFF! "+isConnected);
			   
		    }
	   }
	    
		        public static void increaseVolume(){
					
					if(isConnected == true){
						
						if(currentVolume <= maxVolume){
							
							currentVolume = currentVolume+1;
							
							System.out.println("Current Volume is "+currentVolume);
							
						}else{
							
							System.out.println("Maximum Volume Reached..!");
							
						}
						
					}else{
						
						System.out.println("Please Turn ON the Headset..!");
						
					}
				}					
				   public static void decreaseVolume(){
					   
					   if(isConnected == true){
						   
						   if(currentVolume > minVolume){
							   
							   currentVolume = currentVolume -1;
							   
							   System.out.println("Current Volume decreased to "+ currentVolume);
							   
							}else{
								
								System.out.println("Minimum Volume Reached...!");
								
							}
						
						}else{
							
							System.out.println("Do Turn ON the Headset..!");
						
						}
		  
}
}