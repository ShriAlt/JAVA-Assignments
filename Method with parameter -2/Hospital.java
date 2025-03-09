class  Hospital{
	public static void checkup( String patientname,int age,long mobile, String email,String sicknes){
		System.out.println("patientname:"+patientname);
		System.out.println("age:"+age);
		System.out.println("mobile:"+mobile);
		System.out.println("email:"+email);
		System.out.println("sicknes:"+sicknes);
		Doctor.treatment(patientname,age);
	}
}