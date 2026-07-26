class Nurse{
	
	public static void basicCheck(String patientName,String symptom,
	boolean isBP,boolean isSugar){
		
		System.out.println("basicCheck satrted");
		Doctor.treat(patientName,symptom);
		System.out.println("basicCheck ended");
		
	}
}