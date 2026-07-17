class MaxFashion{

	static String firstName;
	static String lastName;
	static String dateOfBirth;
	static String email;
	static String password;
	static long phoneNumber;
	static boolean isCreated;
	
		public static boolean CreateMaxAccount(String fName, String lName, 
		   String dob, String eId, String pwd, long phoneNo){
	
				isCreated = false;
				
				firstName = fName;
				lastName = lName;
				dateOfBirth = dob;
				email = eId;
				password = pwd;
				phoneNumber = phoneNo;
				
				isCreated = true;
				
			return isCreated;
		
		}
		
		public static void getAccountData(){
		
			System.out.println(isCreated);
			System.out.println("First Name: "+firstName);
			System.out.println("Last Name: "+lastName);
			System.out.println("Date of Birth: "+dateOfBirth);
			System.out.println("Email ID: "+email);
			System.out.println("Password: "+password);
			System.out.println("Phone Number: "+phoneNumber);
		
		}
}		