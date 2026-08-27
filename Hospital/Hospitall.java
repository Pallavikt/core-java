class Hospitall{
	
	public static void bookAppointment(String patientName,String symptom){
		
		System.out.println("bookAppointment satrted");
		Nurse.basicCheck(patientName,symptom,false,false);
		System.out.println("bookAppointment ended");
	}
}