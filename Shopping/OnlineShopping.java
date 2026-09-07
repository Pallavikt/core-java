//child class/sub class/derived class

class OnlineShopping extends Shopping{
	
	public  OnlineShopping(){
		//super();
		System.out.println("Online Shopping constructor invoked");
	}
	
	@Override
	public void purchase(){
		System.out.println("Purchasing Stationary");
	}
}
//process of acquiring the properties and methods from one class to another