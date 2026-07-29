class WireRunner{
	
	public static void main(String[] args){
		//className variable/referenceNmae = new constructor/className();
		Wire wire = new Wire();
		wire.brand = "Havells";
		wire.price = 786.0;
		System.out.println("Brand of wire is "+wire.brand);
		System.out.println("Price of "+wire.brand+" is "+wire.price);
		
		Wire wire1 = new Wire();
		wire.brand = "GM";
		wire.price = 314.0;
		System.out.println("Brand of wire is "+wire.brand);
		System.out.println("Price of "+wire.brand+" is "+wire.price);
		
		Wire wire2 = new Wire();
		wire.brand = "Finolex";
		wire.price = 685.0;
		System.out.println("Brand of wire is "+wire.brand);
		System.out.println("Price of "+wire.brand+" is "+wire.price);
	}
}