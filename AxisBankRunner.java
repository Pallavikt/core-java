class AxisBankRunner{
	
	public static void main(String[] bank){
		
		AxisBank b = new AxisBank();
		System.out.println(b.id);
		System.out.println(b.name);
		
		AxisBank b1 = new AxisBank();
		b1.id = 2;
		System.out.println(b1.id);
		System.out.println(b.name);
		
		AxisBank b2 = new AxisBank();
		b2.id = 3;
		System.out.println(b2.id);
		System.out.println(b.name);
		
	}
}