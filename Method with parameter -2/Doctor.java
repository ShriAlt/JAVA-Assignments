class  Doctor{
	public static void treatment( String patientname,int age){
		System.out.println("patientname:"+patientname);
		System.out.println("age:"+age);
		Nurse.assist(patientname);
	}
}