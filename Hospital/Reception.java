class Reception{
	
	public static void book(String patientName,String symptom,String email,
	long mobile){
		
		System.out.println("book satrted");
		Hospitall.bookAppointment(patientName,symptom);
		
		System.out.println("Patient Name: "+patientName);
		System.out.println("Symptom: "+symptom);
		
		System.out.println("book ended");
	}
	
}