class ParentRunner{
	
	public static void main(String a[]){
		
		Parent parent = new Parent();
		parent.service();
		parent.doBusiness();
		
		System.out.println("________________________");
		
		Parent p = new Child(); //Polymorphism
		p.service();
		p.doBusiness(); // RunTime Polymorphism
		
	}
}