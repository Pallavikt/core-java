class AxisBank{
	
	int id;
	String ifsc;
	String address;
	String state;
	String city;
	String micr;
	String branch;
	String name;
	long phoneNo;
	
	AxisBank(){
		this(1,"UTIF980344","Not Updated");
	}
	
	AxisBank(int id,String ifsc,String micr){
			this("#17,5th block Bhashyam Circle","Bhashyam Circle","Karnataka","Bhashyam Circle","Axis Bank",2352742970L);
			this.id = id;
			this.ifsc = ifsc;
			this.micr = micr;
	}
	
	AxisBank(String address,String city,String state,String branch,String name,long phoneNo){
		this.address = address;
		this.city = city;
		this.state = state;
		this.branch = branch;
		this.name = name;
		this.phoneNo = phoneNo;
	}
}